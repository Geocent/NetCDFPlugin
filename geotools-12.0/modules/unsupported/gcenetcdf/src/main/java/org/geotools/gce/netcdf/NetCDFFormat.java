/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2013, Open Source Geospatial Foundation (OSGeo)
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
package org.geotools.gce.netcdf;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.imageio.GeoToolsWriteParams;
import org.geotools.factory.Hints;
import org.geotools.parameter.DefaultParameterDescriptor;
import org.geotools.parameter.DefaultParameterDescriptorGroup;
import org.geotools.parameter.ParameterGroup;
import org.opengis.coverage.grid.Format;
import org.opengis.coverage.grid.GridCoverageWriter;
import org.opengis.filter.Filter;
import org.opengis.parameter.GeneralParameterDescriptor;
import org.opengis.parameter.ParameterDescriptor;

/**
 * Provides a grid format for NetCDF data files. NetCDF data files can contain many dimensions, and this currently handles elevation, time and
 * reference time.
 */
public class NetCDFFormat extends AbstractGridFormat implements Format {

    private static final String UNSUPPORTED_WRITING_OPERATION_MESSAGE = "Writing operations are not implemented";

    private static final String CANNOT_CREATE_READER_MESSAGE = "Cannot create Netcdf Reader without a directory of netcdf files";

    public static final String NATIVE_FORMAT_NAME = "NetCDF";

    public static final String NETCDF_PARAMETER_NAME = "NETCDFPARAMETER";

    public static final String REFERENCE_TIME_NAME = "REFERENCE_TIME";

    /* The NetCDF Parameter component */
    public static final ParameterDescriptor<String> PARAMETER = new DefaultParameterDescriptor<String>(
            NETCDF_PARAMETER_NAME, String.class, null, null);

    /* The WMS time component */
    @SuppressWarnings("rawtypes")
    public static final ParameterDescriptor<List> TIME = DefaultParameterDescriptor.create("TIME",
            "A list of time objects", List.class, null, false);

    /* The WMS elevation component */
    @SuppressWarnings("rawtypes")
    public static final ParameterDescriptor<List> ELEVATION = DefaultParameterDescriptor.create(
            "ELEVATION", "An elevation value", List.class, null, false);

    /* The custom dimension reference_time component */
    @SuppressWarnings("rawtypes")
    public static final ParameterDescriptor<List> REFERENCE_TIME = DefaultParameterDescriptor
            .create(REFERENCE_TIME_NAME, "Model run time", List.class, null, false);

    /* The CQL filter contents */
    public static final ParameterDescriptor<Filter> FILTER = DefaultParameterDescriptor.create(
            "Filter", "Filter", Filter.class, null, false);

    public NetCDFFormat() {
        writeParameters = null;
        mInfo = new HashMap<String, String>();
        mInfo.put("name", NATIVE_FORMAT_NAME);
        mInfo.put("description", "NetCDF gridded data fomat");
        mInfo.put("vendor", "Geocent");
        mInfo.put("version", "0.2");
        readParameters = new ParameterGroup(new DefaultParameterDescriptorGroup(mInfo,
                new GeneralParameterDescriptor[] { READ_GRIDGEOMETRY2D, PARAMETER, ELEVATION, TIME,
                        REFERENCE_TIME, FILTER }));
    }

    /**
     * TODO Need to find some operation that calls this method, debug and review the input parameters, and revise this method to base the return on
     * them. Possibly the store file name is included in the inputs? If so, can look for .nc or .ncml and return true if found, false if not.
     * 
     */
    @Override
    public boolean accepts(Object arg0, Hints arg1) {
        return true;
    }

    @Override
    public GeoToolsWriteParams getDefaultImageIOWriteParameters() {
        throw new UnsupportedOperationException(UNSUPPORTED_WRITING_OPERATION_MESSAGE);
    }

    @Override
    public AbstractGridCoverage2DReader getReader(Object arg0) {
        return getReader(arg0, null);
    }

    @Override
    public AbstractGridCoverage2DReader getReader(Object arg0, Hints arg1) {
        if (arg0 instanceof File) {
            File path = (File) arg0;
            return new NetCDFReader(path, arg1);
        } else {
            throw new UnsupportedOperationException(CANNOT_CREATE_READER_MESSAGE);
        }
    }

    @Override
    public GridCoverageWriter getWriter(Object arg0) {
        throw new UnsupportedOperationException(UNSUPPORTED_WRITING_OPERATION_MESSAGE);
    }

    @Override
    public GridCoverageWriter getWriter(Object arg0, Hints arg1) {
        throw new UnsupportedOperationException(UNSUPPORTED_WRITING_OPERATION_MESSAGE);
    }
}
