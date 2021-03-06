/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.renderer.crs;

import static org.geotools.referencing.crs.DefaultGeographicCRS.WGS84;

import java.util.ArrayList;
import java.util.List;

import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.referencing.CRS;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;

import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryCollection;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

/**
 * A {@link ProjectionHandler} for projections that do warp in the East/West direction, it will
 * replicate the geometries generating a Google Maps like effect
 * 
 * @author Andrea Aime - OpenGeo
 *
 *
 * @source $URL$
 */
public class WrappingProjectionHandler extends ProjectionHandler {

    protected double radius;
    private int maxWraps;

    private boolean datelineWrappingCheckEnabled = true;

    /**
     * Provides the strategy with the area we want to render and its CRS (the SPI lookup will do
     * this step)
     * @throws FactoryException 
     */
    public WrappingProjectionHandler(ReferencedEnvelope renderingEnvelope,
            ReferencedEnvelope validArea, CoordinateReferenceSystem sourceCrs, double centralMeridian, int maxWraps) throws FactoryException {
        super(sourceCrs, validArea, renderingEnvelope);
        this.maxWraps = maxWraps;

        try {
            CoordinateReferenceSystem targetCRS = renderingEnvelope.getCoordinateReferenceSystem();
            MathTransform mt = CRS.findMathTransform(WGS84, targetCRS, true);
            double[] src = new double[] { centralMeridian, 0, 180 + centralMeridian, 0 };
            double[] dst = new double[4];
            mt.transform(src, 0, dst, 0, 2);

            if(CRS.getAxisOrder(targetCRS) == CRS.AxisOrder.NORTH_EAST) {
                radius = Math.abs(dst[3] - dst[1]);
            }
            else {
                radius = Math.abs(dst[2] - dst[0]);
            }
            
            if(radius <= 0) {
                throw new RuntimeException("Computed Earth radius is 0, what is going on?");
            }
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error computing the Earth radius "
                    + "in the current projection", e);
        }
    }

    @Override
    public Geometry postProcess(MathTransform mt, Geometry geometry) {
        // First let's check if the geometry is undoubtedly not going to need
        // processing
        Envelope env = geometry.getEnvelopeInternal();
        final double width;
        final double reWidth;
        final boolean northEast = CRS.getAxisOrder(targetCRS) == CRS.AxisOrder.NORTH_EAST;
        if(northEast) {
            width = env.getHeight();
            reWidth = renderingEnvelope.getHeight();
        } else {
            width = env.getWidth();
            reWidth = renderingEnvelope.getWidth();
        }
        
        if (width < radius && renderingEnvelope.contains(env)
                && reWidth <= radius * 2) {
            return geometry;
        }

        // Check if the geometry has wrapped the dateline. Heuristic: we assume
        // anything larger than half of the world might have wrapped it, however,
        // if it's touching both datelines then don't wrap it, as it might be something
        // like antarctica
        if (datelineWrappingCheckEnabled && width > radius && width < radius * 2) {
            Geometry wrapped = (Geometry) geometry.clone();
            wrapped.apply(new WrappingCoordinateFilter(radius, radius * 2, mt, northEast));
            wrapped.geometryChanged();
            // did we un-wrap it?
            if (wrapped.getEnvelopeInternal().getWidth() < radius) {
                geometry = wrapped;
                env = geometry.getEnvelopeInternal();
            }
        }

        // The viewing area might contain the geometry multiple times due to
        // wrapping.
        // This is obvious for the geometries that wrapped the dateline, but the
        // viewing
        // area might be large enough to contain the same continent multiple
        // times (a-la Google Maps)
        List<Geometry> geoms = new ArrayList<Geometry>();
        Class geomType = null;

        // search the west-most location inside the current rendering envelope
        // (there may be many)
        double base, curr, lowLimit, highLimit;
        if(northEast) {
            base = env.getMinY();
            curr = env.getMinY();
            lowLimit = Math.max(renderingEnvelope.getMinY(), renderingEnvelope.getMedian(1) - maxWraps * radius * 2); 
            highLimit = Math.min(renderingEnvelope.getMaxY(), renderingEnvelope.getMedian(1) + maxWraps * radius * 2);
        } else {
            base = env.getMinX();
            curr = env.getMinX();
            lowLimit = Math.max(renderingEnvelope.getMinX(), renderingEnvelope.getMedian(0) - maxWraps * radius * 2); 
            highLimit = Math.min(renderingEnvelope.getMaxX(), renderingEnvelope.getMedian(0) + maxWraps * radius * 2);
        }
        while (curr > lowLimit) {
            curr -= radius * 2;
        }

        // clone and offset as necessary
        geomType = accumulate(geoms, geometry, geomType);
        while (curr <= highLimit) {
            double offset = curr - base;
            if (Math.abs(offset) < radius) {
                // in this case we can keep the original geometry, which is already in
            } else {
                // in all other cases we make a copy and offset it
                Geometry offseted = (Geometry) geometry.clone();
                offseted.apply(new OffsetOrdinateFilter(northEast ? 1 : 0, offset));
                offseted.geometryChanged();       
                geomType = accumulate(geoms, offseted, geomType);
            }

            curr += radius * 2;
        }
        
        // if we could not find any geom type we stumbled int an empty geom collection
        if(geomType == null) {
            return null;
        }
        
        // if we did not have to actually clone the geometries
        if(geoms.size() == 1) {
            return geoms.get(0);
        }

        // rewrap all the clones into a single geometry
        if (Point.class.equals(geomType)) {
            Point[] points = geoms.toArray(new Point[geoms.size()]);
            return geometry.getFactory().createMultiPoint(points);
        } else if (LineString.class.isAssignableFrom(geomType)) {
            LineString[] lines = geoms.toArray(new LineString[geoms.size()]);
            return geometry.getFactory().createMultiLineString(lines);
        } else if (Polygon.class.equals(geomType)) {
            Polygon[] polys = geoms.toArray(new Polygon[geoms.size()]);
            return geometry.getFactory().createMultiPolygon(polys);
        } else {
            return geometry.getFactory().createGeometryCollection(
                    geoms.toArray(new Geometry[geoms.size()]));
        }
    }

    /**
     * Adds the geometries into the collection by recursively splitting apart geometry collections,
     * so that geoms will contains only simple geometries.
     * 
     * @param geoms
     * @param geometry
     * @param geomType
     * 
     * @return the geometry type that all geometries added to the collection conform to. Worst case
     *         it's going to be Geometry.class
     */
    private Class accumulate(List<Geometry> geoms, Geometry geometry, Class geomType) {
        for (int i = 0; i < geometry.getNumGeometries(); i++) {
            Geometry g = geometry.getGeometryN(i);
            Class gtype = null;
            if (g instanceof GeometryCollection) {
                gtype = accumulate(geoms, g, geomType);
            } else {
                if(renderingEnvelope.intersects(g.getEnvelopeInternal())) {
                    geoms.add(g);
                    gtype = g.getClass();
                }
            }
            
            if (geomType == null) {
                geomType = g.getClass();
            } else if (!g.getClass().equals(geomType)) {
                geomType = Geometry.class;
            }
        }
        return geomType;
    }

    @Override
    public boolean requiresProcessing(Geometry geometry) {
        return true;
    }

    public boolean isDatelineWrappingCheckEnabled() {
        return datelineWrappingCheckEnabled;
    }

    /**
     * Enables the check using the "half world" heuristic on the input geometries, if larger it
     * assumes they spanned the dateline. Enabled by default
     * 
     * @param datelineWrappingCheckEnabled
     */
    public void setDatelineWrappingCheckEnabled(boolean datelineWrappingCheckEnabled) {
        this.datelineWrappingCheckEnabled = datelineWrappingCheckEnabled;
    }
}
