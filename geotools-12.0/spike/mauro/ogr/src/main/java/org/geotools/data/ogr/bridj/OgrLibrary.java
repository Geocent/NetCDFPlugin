package org.geotools.data.ogr.bridj;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ValuedEnum;
import org.bridj.ann.CLong;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>ogr</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ogr") 
@Runtime(CRuntime.class) 
public class OgrLibrary {
	static {
		BridJ.register();
	}
	public enum OGRwkbGeometryType implements IntValuedEnum<OGRwkbGeometryType > {
		wkbUnknown(0),
		wkbPoint(1),
		wkbLineString(2),
		wkbPolygon(3),
		wkbMultiPoint(4),
		wkbMultiLineString(5),
		wkbMultiPolygon(6),
		wkbGeometryCollection(7),
		wkbNone(100),
		wkbLinearRing(101),
		wkbPoint25D(-2147483647),
		wkbLineString25D(-2147483646),
		wkbPolygon25D(-2147483645),
		wkbMultiPoint25D(-2147483644),
		wkbMultiLineString25D(-2147483643),
		wkbMultiPolygon25D(-2147483642),
		wkbGeometryCollection25D(-2147483641);
		OGRwkbGeometryType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRwkbGeometryType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRwkbGeometryType > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRwkbByteOrder implements IntValuedEnum<OGRwkbByteOrder > {
		wkbXDR(0),
		wkbNDR(1);
		OGRwkbByteOrder(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRwkbByteOrder > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRwkbByteOrder > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRFieldType implements IntValuedEnum<OGRFieldType > {
		OFTInteger(0),
		OFTIntegerList(1),
		OFTReal(2),
		OFTRealList(3),
		OFTString(4),
		OFTStringList(5),
		OFTWideString(6),
		OFTWideStringList(7),
		OFTBinary(8),
		OFTDate(9),
		OFTTime(10),
		OFTDateTime(11),
		OFTMaxType(11);
		OGRFieldType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRFieldType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRFieldType > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRJustification implements IntValuedEnum<OGRJustification > {
		OJUndefined(0),
		OJLeft(1),
		OJRight(2);
		OGRJustification(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRJustification > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRJustification > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRSTClassId implements IntValuedEnum<OGRSTClassId > {
		OGRSTCNone(0),
		OGRSTCPen(1),
		OGRSTCBrush(2),
		OGRSTCSymbol(3),
		OGRSTCLabel(4),
		OGRSTCVector(5);
		OGRSTClassId(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRSTClassId > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRSTClassId > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRSTUnitId implements IntValuedEnum<OGRSTUnitId > {
		OGRSTUGround(0),
		OGRSTUPixel(1),
		OGRSTUPoints(2),
		OGRSTUMM(3),
		OGRSTUCM(4),
		OGRSTUInches(5);
		OGRSTUnitId(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRSTUnitId > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRSTUnitId > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRSTPenParam implements IntValuedEnum<OGRSTPenParam > {
		OGRSTPenColor(0),
		OGRSTPenWidth(1),
		OGRSTPenPattern(2),
		OGRSTPenId(3),
		OGRSTPenPerOffset(4),
		OGRSTPenCap(5),
		OGRSTPenJoin(6),
		OGRSTPenPriority(7),
		OGRSTPenLast(8);
		OGRSTPenParam(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRSTPenParam > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRSTPenParam > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRSTBrushParam implements IntValuedEnum<OGRSTBrushParam > {
		OGRSTBrushFColor(0),
		OGRSTBrushBColor(1),
		OGRSTBrushId(2),
		OGRSTBrushAngle(3),
		OGRSTBrushSize(4),
		OGRSTBrushDx(5),
		OGRSTBrushDy(6),
		OGRSTBrushPriority(7),
		OGRSTBrushLast(8);
		OGRSTBrushParam(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRSTBrushParam > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRSTBrushParam > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRSTSymbolParam implements IntValuedEnum<OGRSTSymbolParam > {
		OGRSTSymbolId(0),
		OGRSTSymbolAngle(1),
		OGRSTSymbolColor(2),
		OGRSTSymbolSize(3),
		OGRSTSymbolDx(4),
		OGRSTSymbolDy(5),
		OGRSTSymbolStep(6),
		OGRSTSymbolPerp(7),
		OGRSTSymbolOffset(8),
		OGRSTSymbolPriority(9),
		OGRSTSymbolFontName(10),
		OGRSTSymbolOColor(11),
		OGRSTSymbolLast(12);
		OGRSTSymbolParam(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRSTSymbolParam > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRSTSymbolParam > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public enum OGRSTLabelParam implements IntValuedEnum<OGRSTLabelParam > {
		OGRSTLabelFontName(0),
		OGRSTLabelSize(1),
		OGRSTLabelTextString(2),
		OGRSTLabelAngle(3),
		OGRSTLabelFColor(4),
		OGRSTLabelBColor(5),
		OGRSTLabelPlacement(6),
		OGRSTLabelAnchor(7),
		OGRSTLabelDx(8),
		OGRSTLabelDy(9),
		OGRSTLabelPerp(10),
		OGRSTLabelBold(11),
		OGRSTLabelItalic(12),
		OGRSTLabelUnderline(13),
		OGRSTLabelPriority(14),
		OGRSTLabelStrikeout(15),
		OGRSTLabelStretch(16),
		OGRSTLabelAdjHor(17),
		OGRSTLabelAdjVert(18),
		OGRSTLabelHColor(19),
		OGRSTLabelOColor(20),
		OGRSTLabelLast(21);
		OGRSTLabelParam(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<OGRSTLabelParam > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static ValuedEnum<OGRSTLabelParam > fromValue(long value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCCreateField = (String)"CreateField";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCTransactions = (String)"Transactions";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRNullFID = (int)-1;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCFastSetNextByIndex = (String)"FastSetNextByIndex";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_INVALID_HANDLE = (int)8;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String ODrCDeleteDataSource = (String)"DeleteDataSource";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_UNSUPPORTED_OPERATION = (int)4;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String ODrCCreateDataSource = (String)"CreateDataSource";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_FAILURE = (int)6;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int ogrZMarker = (int)554850065;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCStringsAsUTF8 = (String)"StringsAsUTF8";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_UNSUPPORTED_GEOMETRY_TYPE = (int)3;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCSequentialWrite = (String)"SequentialWrite";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCFastFeatureCount = (String)"FastFeatureCount";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_NOT_ENOUGH_MEMORY = (int)2;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCIgnoreFields = (String)"IgnoreFields";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_NOT_ENOUGH_DATA = (int)1;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCFastGetExtent = (String)"FastGetExtent";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String ODsCDeleteLayer = (String)"DeleteLayer";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_CORRUPT_DATA = (int)5;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCDeleteFeature = (String)"DeleteFeature";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_UNSUPPORTED_SRS = (int)7;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int wkb25DBit = (int)-2147483648;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCFastSpatialFilter = (String)"FastSpatialFilter";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRUnsetMarker = (int)-21121;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCRandomWrite = (String)"RandomWrite";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final int OGRERR_NONE = (int)0;
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String ODsCCreateLayer = (String)"CreateLayer";
	/// <i>native declaration : /home/aaime/devel/gdal/gdal-1.8.0/ogr/ogr_core.h</i>
	public static final String OLCRandomRead = (String)"RandomRead";
	public static native Pointer<? > OGRMalloc(@Ptr long size_t1);
	public static native Pointer<? > OGRCalloc(@Ptr long size_t1, @Ptr long size_t2);
	public static native Pointer<? > OGRRealloc(Pointer<? > voidPtr1, @Ptr long size_t1);
	public static native Pointer<Byte > OGRStrdup(Pointer<Byte > charPtr1);
	public static native void OGRFree(Pointer<? > voidPtr1);
	public static native Pointer<Byte > OGRGeometryTypeToName(ValuedEnum<OgrLibrary.OGRwkbGeometryType > eType);
	public static native ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGRMergeGeometryTypes(ValuedEnum<OgrLibrary.OGRwkbGeometryType > eMain, ValuedEnum<OgrLibrary.OGRwkbGeometryType > eExtra);
	public static native int OGRParseDate(Pointer<Byte > pszInput, Pointer<OGRField > psOutput, int nOptions);
	public static native Pointer<Byte > GDALVersionInfo(Pointer<Byte > charPtr1);
	public static native int GDALCheckVersion(int nVersionMajor, int nVersionMinor, Pointer<Byte > pszCallingComponentName);
	public static native int OGR_G_CreateFromWkb(Pointer<Byte > charPtr1, Pointer<? > OGRSpatialReferenceH1, Pointer<Pointer<? > > OGRGeometryHPtr1, int int1);
	public static native int OGR_G_CreateFromWkt(Pointer<Pointer<Byte > > charPtrPtr1, Pointer<? > OGRSpatialReferenceH1, Pointer<Pointer<? > > OGRGeometryHPtr1);
	public static native int OGR_G_CreateFromFgf(Pointer<Byte > charPtr1, Pointer<? > OGRSpatialReferenceH1, Pointer<Pointer<? > > OGRGeometryHPtr1, int int1, Pointer<Integer > intPtr1);
	public static native void OGR_G_DestroyGeometry(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_CreateGeometry(ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGRwkbGeometryType1);
	public static native Pointer<? > OGR_G_ApproximateArcAngles(double dfCenterX, double dfCenterY, double dfZ, double dfPrimaryRadius, double dfSecondaryAxis, double dfRotation, double dfStartAngle, double dfEndAngle, double dfMaxAngleStepSizeDegrees);
	public static native Pointer<? > OGR_G_ForceToPolygon(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_ForceToMultiPolygon(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_ForceToMultiPoint(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_ForceToMultiLineString(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_GetDimension(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_GetCoordinateDimension(Pointer<? > OGRGeometryH1);
	public static native void OGR_G_SetCoordinateDimension(Pointer<? > OGRGeometryH1, int int1);
	public static native Pointer<? > OGR_G_Clone(Pointer<? > OGRGeometryH1);
	public static native void OGR_G_GetEnvelope(Pointer<? > OGRGeometryH1, Pointer<OGREnvelope > OGREnvelopePtr1);
	public static native int OGR_G_ImportFromWkb(Pointer<? > OGRGeometryH1, Pointer<Byte > charPtr1, int int1);
	public static native int OGR_G_ExportToWkb(Pointer<? > OGRGeometryH1, ValuedEnum<OgrLibrary.OGRwkbByteOrder > OGRwkbByteOrder1, Pointer<Byte > charPtr1);
	public static native int OGR_G_WkbSize(Pointer<? > hGeom);
	public static native int OGR_G_ImportFromWkt(Pointer<? > OGRGeometryH1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native int OGR_G_ExportToWkt(Pointer<? > OGRGeometryH1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGR_G_GetGeometryType(Pointer<? > OGRGeometryH1);
	public static native Pointer<Byte > OGR_G_GetGeometryName(Pointer<? > OGRGeometryH1);
	public static native void OGR_G_DumpReadable(Pointer<? > OGRGeometryH1, Pointer<OgrLibrary._IO_FILE > FILEPtr1, Pointer<Byte > charPtr1);
	public static native void OGR_G_FlattenTo2D(Pointer<? > OGRGeometryH1);
	public static native void OGR_G_CloseRings(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_CreateFromGML(Pointer<Byte > charPtr1);
	public static native Pointer<Byte > OGR_G_ExportToGML(Pointer<? > OGRGeometryH1);
	public static native Pointer<Byte > OGR_G_ExportToGMLEx(Pointer<? > OGRGeometryH1, Pointer<Pointer<Byte > > papszOptions);
	public static native Pointer<Byte > OGR_G_ExportToKML(Pointer<? > OGRGeometryH1, Pointer<Byte > pszAltitudeMode);
	public static native Pointer<Byte > OGR_G_ExportToJson(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_CreateGeometryFromJson(Pointer<Byte > charPtr1);
	public static native void OGR_G_AssignSpatialReference(Pointer<? > OGRGeometryH1, Pointer<? > OGRSpatialReferenceH1);
	public static native Pointer<? > OGR_G_GetSpatialReference(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_Transform(Pointer<? > OGRGeometryH1, Pointer<? > OGRCoordinateTransformationH1);
	public static native int OGR_G_TransformTo(Pointer<? > OGRGeometryH1, Pointer<? > OGRSpatialReferenceH1);
	public static native Pointer<? > OGR_G_Simplify(Pointer<? > hThis, double tolerance);
	public static native void OGR_G_Segmentize(Pointer<? > hGeom, double dfMaxLength);
	public static native int OGR_G_Intersects(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Equals(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Disjoint(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Touches(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Crosses(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Within(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Contains(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Overlaps(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native Pointer<? > OGR_G_Boundary(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_ConvexHull(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_Buffer(Pointer<? > OGRGeometryH1, double double1, int int1);
	public static native Pointer<? > OGR_G_Intersection(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native Pointer<? > OGR_G_Union(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native Pointer<? > OGR_G_UnionCascaded(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_Difference(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native Pointer<? > OGR_G_SymDifference(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native double OGR_G_Distance(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native double OGR_G_Length(Pointer<? > OGRGeometryH1);
	public static native double OGR_G_Area(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_Centroid(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native void OGR_G_Empty(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_IsEmpty(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_IsValid(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_IsSimple(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_IsRing(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_Intersect(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_Equal(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native Pointer<? > OGR_G_SymmetricDifference(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native double OGR_G_GetArea(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_GetBoundary(Pointer<? > OGRGeometryH1);
	public static native int OGR_G_GetPointCount(Pointer<? > OGRGeometryH1);
	public static native double OGR_G_GetX(Pointer<? > OGRGeometryH1, int int1);
	public static native double OGR_G_GetY(Pointer<? > OGRGeometryH1, int int1);
	public static native double OGR_G_GetZ(Pointer<? > OGRGeometryH1, int int1);
	public static native void OGR_G_GetPoint(Pointer<? > OGRGeometryH1, int iPoint, Pointer<Double > doublePtr1, Pointer<Double > doublePtr2, Pointer<Double > doublePtr3);
	public static native void OGR_G_SetPoint(Pointer<? > OGRGeometryH1, int iPoint, double double1, double double2, double double3);
	public static native void OGR_G_SetPoint_2D(Pointer<? > OGRGeometryH1, int iPoint, double double1, double double2);
	public static native void OGR_G_AddPoint(Pointer<? > OGRGeometryH1, double double1, double double2, double double3);
	public static native void OGR_G_AddPoint_2D(Pointer<? > OGRGeometryH1, double double1, double double2);
	public static native int OGR_G_GetGeometryCount(Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_G_GetGeometryRef(Pointer<? > OGRGeometryH1, int int1);
	public static native int OGR_G_AddGeometry(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_AddGeometryDirectly(Pointer<? > OGRGeometryH1, Pointer<? > OGRGeometryH2);
	public static native int OGR_G_RemoveGeometry(Pointer<? > OGRGeometryH1, int int1, int int2);
	public static native Pointer<? > OGRBuildPolygonFromEdges(Pointer<? > hLinesAsCollection, int bBestEffort, int bAutoClose, double dfTolerance, Pointer<Integer > peErr);
	public static native int OGRSetGenerate_DB2_V72_BYTE_ORDER(int bGenerate_DB2_V72_BYTE_ORDER);
	public static native int OGRGetGenerate_DB2_V72_BYTE_ORDER();
	public static native Pointer<? > OGR_Fld_Create(Pointer<Byte > charPtr1, ValuedEnum<OgrLibrary.OGRFieldType > OGRFieldType1);
	public static native void OGR_Fld_Destroy(Pointer<? > OGRFieldDefnH1);
	public static native void OGR_Fld_SetName(Pointer<? > OGRFieldDefnH1, Pointer<Byte > charPtr1);
	public static native Pointer<Byte > OGR_Fld_GetNameRef(Pointer<? > OGRFieldDefnH1);
	public static native ValuedEnum<OgrLibrary.OGRFieldType > OGR_Fld_GetType(Pointer<? > OGRFieldDefnH1);
	public static native void OGR_Fld_SetType(Pointer<? > OGRFieldDefnH1, ValuedEnum<OgrLibrary.OGRFieldType > OGRFieldType1);
	public static native ValuedEnum<OgrLibrary.OGRJustification > OGR_Fld_GetJustify(Pointer<? > OGRFieldDefnH1);
	public static native void OGR_Fld_SetJustify(Pointer<? > OGRFieldDefnH1, ValuedEnum<OgrLibrary.OGRJustification > OGRJustification1);
	public static native int OGR_Fld_GetWidth(Pointer<? > OGRFieldDefnH1);
	public static native void OGR_Fld_SetWidth(Pointer<? > OGRFieldDefnH1, int int1);
	public static native int OGR_Fld_GetPrecision(Pointer<? > OGRFieldDefnH1);
	public static native void OGR_Fld_SetPrecision(Pointer<? > OGRFieldDefnH1, int int1);
	public static native void OGR_Fld_Set(Pointer<? > OGRFieldDefnH1, Pointer<Byte > charPtr1, ValuedEnum<OgrLibrary.OGRFieldType > OGRFieldType1, int int1, int int2, ValuedEnum<OgrLibrary.OGRJustification > OGRJustification1);
	public static native int OGR_Fld_IsIgnored(Pointer<? > hDefn);
	public static native void OGR_Fld_SetIgnored(Pointer<? > hDefn, int int1);
	public static native Pointer<Byte > OGR_GetFieldTypeName(ValuedEnum<OgrLibrary.OGRFieldType > OGRFieldType1);
	public static native Pointer<? > OGR_FD_Create(Pointer<Byte > charPtr1);
	public static native void OGR_FD_Destroy(Pointer<? > OGRFeatureDefnH1);
	public static native void OGR_FD_Release(Pointer<? > OGRFeatureDefnH1);
	public static native Pointer<Byte > OGR_FD_GetName(Pointer<? > OGRFeatureDefnH1);
	public static native int OGR_FD_GetFieldCount(Pointer<? > OGRFeatureDefnH1);
	public static native Pointer<? > OGR_FD_GetFieldDefn(Pointer<? > OGRFeatureDefnH1, int int1);
	public static native int OGR_FD_GetFieldIndex(Pointer<? > OGRFeatureDefnH1, Pointer<Byte > charPtr1);
	public static native void OGR_FD_AddFieldDefn(Pointer<? > OGRFeatureDefnH1, Pointer<? > OGRFieldDefnH1);
	public static native ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGR_FD_GetGeomType(Pointer<? > OGRFeatureDefnH1);
	public static native void OGR_FD_SetGeomType(Pointer<? > OGRFeatureDefnH1, ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGRwkbGeometryType1);
	public static native int OGR_FD_IsGeometryIgnored(Pointer<? > OGRFeatureDefnH1);
	public static native void OGR_FD_SetGeometryIgnored(Pointer<? > OGRFeatureDefnH1, int int1);
	public static native int OGR_FD_IsStyleIgnored(Pointer<? > OGRFeatureDefnH1);
	public static native void OGR_FD_SetStyleIgnored(Pointer<? > OGRFeatureDefnH1, int int1);
	public static native int OGR_FD_Reference(Pointer<? > OGRFeatureDefnH1);
	public static native int OGR_FD_Dereference(Pointer<? > OGRFeatureDefnH1);
	public static native int OGR_FD_GetReferenceCount(Pointer<? > OGRFeatureDefnH1);
	public static native Pointer<? > OGR_F_Create(Pointer<? > OGRFeatureDefnH1);
	public static native void OGR_F_Destroy(Pointer<? > OGRFeatureH1);
	public static native Pointer<? > OGR_F_GetDefnRef(Pointer<? > OGRFeatureH1);
	public static native int OGR_F_SetGeometryDirectly(Pointer<? > OGRFeatureH1, Pointer<? > OGRGeometryH1);
	public static native int OGR_F_SetGeometry(Pointer<? > OGRFeatureH1, Pointer<? > OGRGeometryH1);
	public static native Pointer<? > OGR_F_GetGeometryRef(Pointer<? > OGRFeatureH1);
	public static native Pointer<? > OGR_F_StealGeometry(Pointer<? > OGRFeatureH1);
	public static native Pointer<? > OGR_F_Clone(Pointer<? > OGRFeatureH1);
	public static native int OGR_F_Equal(Pointer<? > OGRFeatureH1, Pointer<? > OGRFeatureH2);
	public static native int OGR_F_GetFieldCount(Pointer<? > OGRFeatureH1);
	public static native Pointer<? > OGR_F_GetFieldDefnRef(Pointer<? > OGRFeatureH1, int int1);
	public static native int OGR_F_GetFieldIndex(Pointer<? > OGRFeatureH1, Pointer<Byte > charPtr1);
	public static native int OGR_F_IsFieldSet(Pointer<? > OGRFeatureH1, int int1);
	public static native void OGR_F_UnsetField(Pointer<? > OGRFeatureH1, int int1);
	public static native Pointer<OGRField > OGR_F_GetRawFieldRef(Pointer<? > OGRFeatureH1, int int1);
	public static native int OGR_F_GetFieldAsInteger(Pointer<? > OGRFeatureH1, int int1);
	public static native double OGR_F_GetFieldAsDouble(Pointer<? > OGRFeatureH1, int int1);
	public static native Pointer<Byte > OGR_F_GetFieldAsString(Pointer<? > OGRFeatureH1, int int1);
	public static native Pointer<Integer > OGR_F_GetFieldAsIntegerList(Pointer<? > OGRFeatureH1, int int1, Pointer<Integer > intPtr1);
	public static native Pointer<Double > OGR_F_GetFieldAsDoubleList(Pointer<? > OGRFeatureH1, int int1, Pointer<Integer > intPtr1);
	public static native Pointer<Pointer<Byte > > OGR_F_GetFieldAsStringList(Pointer<? > OGRFeatureH1, int int1);
	public static native Pointer<Byte > OGR_F_GetFieldAsBinary(Pointer<? > OGRFeatureH1, int int1, Pointer<Integer > intPtr1);
	public static native int OGR_F_GetFieldAsDateTime(Pointer<? > OGRFeatureH1, int int1, Pointer<Integer > intPtr1, Pointer<Integer > intPtr2, Pointer<Integer > intPtr3, Pointer<Integer > intPtr4, Pointer<Integer > intPtr5, Pointer<Integer > intPtr6, Pointer<Integer > intPtr7);
	public static native void OGR_F_SetFieldInteger(Pointer<? > OGRFeatureH1, int int1, int int2);
	public static native void OGR_F_SetFieldDouble(Pointer<? > OGRFeatureH1, int int1, double double1);
	public static native void OGR_F_SetFieldString(Pointer<? > OGRFeatureH1, int int1, Pointer<Byte > charPtr1);
	public static native void OGR_F_SetFieldIntegerList(Pointer<? > OGRFeatureH1, int int1, int int2, Pointer<Integer > intPtr1);
	public static native void OGR_F_SetFieldDoubleList(Pointer<? > OGRFeatureH1, int int1, int int2, Pointer<Double > doublePtr1);
	public static native void OGR_F_SetFieldStringList(Pointer<? > OGRFeatureH1, int int1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native void OGR_F_SetFieldRaw(Pointer<? > OGRFeatureH1, int int1, Pointer<OGRField > OGRFieldPtr1);
	public static native void OGR_F_SetFieldBinary(Pointer<? > OGRFeatureH1, int int1, int int2, Pointer<Byte > GBytePtr1);
	public static native void OGR_F_SetFieldDateTime(Pointer<? > OGRFeatureH1, int int1, int int2, int int3, int int4, int int5, int int6, int int7, int int8);
	public static native long OGR_F_GetFID(Pointer<? > OGRFeatureH1);
	public static native int OGR_F_SetFID(Pointer<? > OGRFeatureH1, @CLong long l1);
	public static native void OGR_F_DumpReadable(Pointer<? > OGRFeatureH1, Pointer<OgrLibrary._IO_FILE > FILEPtr1);
	public static native int OGR_F_SetFrom(Pointer<? > OGRFeatureH1, Pointer<? > OGRFeatureH2, int int1);
	public static native int OGR_F_SetFromWithMap(Pointer<? > OGRFeatureH1, Pointer<? > OGRFeatureH2, int int1, Pointer<Integer > intPtr1);
	public static native Pointer<Byte > OGR_F_GetStyleString(Pointer<? > OGRFeatureH1);
	public static native void OGR_F_SetStyleString(Pointer<? > OGRFeatureH1, Pointer<Byte > charPtr1);
	public static native void OGR_F_SetStyleStringDirectly(Pointer<? > OGRFeatureH1, Pointer<Byte > charPtr1);
	public static native Pointer<? > OGR_F_GetStyleTable(Pointer<? > OGRFeatureH1);
	public static native void OGR_F_SetStyleTableDirectly(Pointer<? > OGRFeatureH1, Pointer<? > OGRStyleTableH1);
	public static native void OGR_F_SetStyleTable(Pointer<? > OGRFeatureH1, Pointer<? > OGRStyleTableH1);
	public static native Pointer<Byte > OGR_L_GetName(Pointer<? > OGRLayerH1);
	public static native ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGR_L_GetGeomType(Pointer<? > OGRLayerH1);
	public static native Pointer<? > OGR_L_GetSpatialFilter(Pointer<? > OGRLayerH1);
	public static native void OGR_L_SetSpatialFilter(Pointer<? > OGRLayerH1, Pointer<? > OGRGeometryH1);
	public static native void OGR_L_SetSpatialFilterRect(Pointer<? > OGRLayerH1, double double1, double double2, double double3, double double4);
	public static native int OGR_L_SetAttributeFilter(Pointer<? > OGRLayerH1, Pointer<Byte > charPtr1);
	public static native void OGR_L_ResetReading(Pointer<? > OGRLayerH1);
	public static native Pointer<? > OGR_L_GetNextFeature(Pointer<? > OGRLayerH1);
	public static native int OGR_L_SetNextByIndex(Pointer<? > OGRLayerH1, @CLong long l1);
	public static native Pointer<? > OGR_L_GetFeature(Pointer<? > OGRLayerH1, @CLong long l1);
	public static native int OGR_L_SetFeature(Pointer<? > OGRLayerH1, Pointer<? > OGRFeatureH1);
	public static native int OGR_L_CreateFeature(Pointer<? > OGRLayerH1, Pointer<? > OGRFeatureH1);
	public static native int OGR_L_DeleteFeature(Pointer<? > OGRLayerH1, @CLong long l1);
	public static native Pointer<? > OGR_L_GetLayerDefn(Pointer<? > OGRLayerH1);
	public static native Pointer<? > OGR_L_GetSpatialRef(Pointer<? > OGRLayerH1);
	public static native int OGR_L_GetFeatureCount(Pointer<? > OGRLayerH1, int int1);
	public static native int OGR_L_GetExtent(Pointer<? > OGRLayerH1, Pointer<OGREnvelope > OGREnvelopePtr1, int int1);
	public static native int OGR_L_TestCapability(Pointer<? > OGRLayerH1, Pointer<Byte > charPtr1);
	public static native int OGR_L_CreateField(Pointer<? > OGRLayerH1, Pointer<? > OGRFieldDefnH1, int int1);
	public static native int OGR_L_StartTransaction(Pointer<? > OGRLayerH1);
	public static native int OGR_L_CommitTransaction(Pointer<? > OGRLayerH1);
	public static native int OGR_L_RollbackTransaction(Pointer<? > OGRLayerH1);
	public static native int OGR_L_Reference(Pointer<? > OGRLayerH1);
	public static native int OGR_L_Dereference(Pointer<? > OGRLayerH1);
	public static native int OGR_L_GetRefCount(Pointer<? > OGRLayerH1);
	public static native int OGR_L_SyncToDisk(Pointer<? > OGRLayerH1);
	public static native long OGR_L_GetFeaturesRead(Pointer<? > OGRLayerH1);
	public static native Pointer<Byte > OGR_L_GetFIDColumn(Pointer<? > OGRLayerH1);
	public static native Pointer<Byte > OGR_L_GetGeometryColumn(Pointer<? > OGRLayerH1);
	public static native Pointer<? > OGR_L_GetStyleTable(Pointer<? > OGRLayerH1);
	public static native void OGR_L_SetStyleTableDirectly(Pointer<? > OGRLayerH1, Pointer<? > OGRStyleTableH1);
	public static native void OGR_L_SetStyleTable(Pointer<? > OGRLayerH1, Pointer<? > OGRStyleTableH1);
	public static native int OGR_L_SetIgnoredFields(Pointer<? > OGRLayerH1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native void OGR_DS_Destroy(Pointer<? > OGRDataSourceH1);
	public static native Pointer<Byte > OGR_DS_GetName(Pointer<? > OGRDataSourceH1);
	public static native int OGR_DS_GetLayerCount(Pointer<? > OGRDataSourceH1);
	public static native Pointer<? > OGR_DS_GetLayer(Pointer<? > OGRDataSourceH1, int int1);
	public static native Pointer<? > OGR_DS_GetLayerByName(Pointer<? > OGRDataSourceH1, Pointer<Byte > charPtr1);
	public static native int OGR_DS_DeleteLayer(Pointer<? > OGRDataSourceH1, int int1);
	public static native Pointer<? > OGR_DS_GetDriver(Pointer<? > OGRDataSourceH1);
	public static native Pointer<? > OGR_DS_CreateLayer(Pointer<? > OGRDataSourceH1, Pointer<Byte > charPtr1, Pointer<? > OGRSpatialReferenceH1, ValuedEnum<OgrLibrary.OGRwkbGeometryType > OGRwkbGeometryType1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native Pointer<? > OGR_DS_CopyLayer(Pointer<? > OGRDataSourceH1, Pointer<? > OGRLayerH1, Pointer<Byte > charPtr1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native int OGR_DS_TestCapability(Pointer<? > OGRDataSourceH1, Pointer<Byte > charPtr1);
	public static native Pointer<? > OGR_DS_ExecuteSQL(Pointer<? > OGRDataSourceH1, Pointer<Byte > charPtr1, Pointer<? > OGRGeometryH1, Pointer<Byte > charPtr2);
	public static native void OGR_DS_ReleaseResultSet(Pointer<? > OGRDataSourceH1, Pointer<? > OGRLayerH1);
	public static native int OGR_DS_Reference(Pointer<? > OGRDataSourceH1);
	public static native int OGR_DS_Dereference(Pointer<? > OGRDataSourceH1);
	public static native int OGR_DS_GetRefCount(Pointer<? > OGRDataSourceH1);
	public static native int OGR_DS_GetSummaryRefCount(Pointer<? > OGRDataSourceH1);
	public static native int OGR_DS_SyncToDisk(Pointer<? > OGRDataSourceH1);
	public static native Pointer<? > OGR_DS_GetStyleTable(Pointer<? > OGRDataSourceH1);
	public static native void OGR_DS_SetStyleTableDirectly(Pointer<? > OGRDataSourceH1, Pointer<? > OGRStyleTableH1);
	public static native void OGR_DS_SetStyleTable(Pointer<? > OGRDataSourceH1, Pointer<? > OGRStyleTableH1);
	public static native Pointer<Byte > OGR_Dr_GetName(Pointer<? > OGRSFDriverH1);
	public static native Pointer<? > OGR_Dr_Open(Pointer<? > OGRSFDriverH1, Pointer<Byte > charPtr1, int int1);
	public static native int OGR_Dr_TestCapability(Pointer<? > OGRSFDriverH1, Pointer<Byte > charPtr1);
	public static native Pointer<? > OGR_Dr_CreateDataSource(Pointer<? > OGRSFDriverH1, Pointer<Byte > charPtr1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native Pointer<? > OGR_Dr_CopyDataSource(Pointer<? > OGRSFDriverH1, Pointer<? > OGRDataSourceH1, Pointer<Byte > charPtr1, Pointer<Pointer<Byte > > charPtrPtr1);
	public static native int OGR_Dr_DeleteDataSource(Pointer<? > OGRSFDriverH1, Pointer<Byte > charPtr1);
	public static native Pointer<? > OGROpen(Pointer<Byte > charPtr1, int int1, Pointer<Pointer<? > > OGRSFDriverHPtr1);
	public static native Pointer<? > OGROpenShared(Pointer<Byte > charPtr1, int int1, Pointer<Pointer<? > > OGRSFDriverHPtr1);
	public static native int OGRReleaseDataSource(Pointer<? > OGRDataSourceH1);
	public static native void OGRRegisterDriver(Pointer<? > OGRSFDriverH1);
	public static native void OGRDeregisterDriver(Pointer<? > OGRSFDriverH1);
	public static native int OGRGetDriverCount();
	public static native Pointer<? > OGRGetDriver(int int1);
	public static native Pointer<? > OGRGetDriverByName(Pointer<Byte > charPtr1);
	public static native int OGRGetOpenDSCount();
	public static native Pointer<? > OGRGetOpenDS(int iDS);
	public static native void OGRRegisterAll();
	public static native void OGRCleanupAll();
	public static native Pointer<? > OGR_SM_Create(Pointer<? > hStyleTable);
	public static native void OGR_SM_Destroy(Pointer<? > hSM);
	public static native Pointer<Byte > OGR_SM_InitFromFeature(Pointer<? > hSM, Pointer<? > hFeat);
	public static native int OGR_SM_InitStyleString(Pointer<? > hSM, Pointer<Byte > pszStyleString);
	public static native int OGR_SM_GetPartCount(Pointer<? > hSM, Pointer<Byte > pszStyleString);
	public static native Pointer<? > OGR_SM_GetPart(Pointer<? > hSM, int nPartId, Pointer<Byte > pszStyleString);
	public static native int OGR_SM_AddPart(Pointer<? > hSM, Pointer<? > hST);
	public static native int OGR_SM_AddStyle(Pointer<? > hSM, Pointer<Byte > pszStyleName, Pointer<Byte > pszStyleString);
	public static native Pointer<? > OGR_ST_Create(ValuedEnum<OgrLibrary.OGRSTClassId > eClassId);
	public static native void OGR_ST_Destroy(Pointer<? > hST);
	public static native ValuedEnum<OgrLibrary.OGRSTClassId > OGR_ST_GetType(Pointer<? > hST);
	public static native ValuedEnum<OgrLibrary.OGRSTUnitId > OGR_ST_GetUnit(Pointer<? > hST);
	public static native void OGR_ST_SetUnit(Pointer<? > hST, ValuedEnum<OgrLibrary.OGRSTUnitId > eUnit, double dfGroundPaperScale);
	public static native Pointer<Byte > OGR_ST_GetParamStr(Pointer<? > hST, int eParam, Pointer<Integer > bValueIsNull);
	public static native int OGR_ST_GetParamNum(Pointer<? > hST, int eParam, Pointer<Integer > bValueIsNull);
	public static native double OGR_ST_GetParamDbl(Pointer<? > hST, int eParam, Pointer<Integer > bValueIsNull);
	public static native void OGR_ST_SetParamStr(Pointer<? > hST, int eParam, Pointer<Byte > pszValue);
	public static native void OGR_ST_SetParamNum(Pointer<? > hST, int eParam, int nValue);
	public static native void OGR_ST_SetParamDbl(Pointer<? > hST, int eParam, double dfValue);
	public static native Pointer<Byte > OGR_ST_GetStyleString(Pointer<? > hST);
	public static native int OGR_ST_GetRGBFromString(Pointer<? > hST, Pointer<Byte > pszColor, Pointer<Integer > pnRed, Pointer<Integer > pnGreen, Pointer<Integer > pnBlue, Pointer<Integer > pnAlpha);
	public static native Pointer<? > OGR_STBL_Create();
	public static native void OGR_STBL_Destroy(Pointer<? > hSTBL);
	public static native int OGR_STBL_SaveStyleTable(Pointer<? > hStyleTable, Pointer<Byte > pszFilename);
	public static native int OGR_STBL_LoadStyleTable(Pointer<? > hStyleTable, Pointer<Byte > pszFilename);
	public static native Pointer<Byte > OGR_STBL_Find(Pointer<? > hStyleTable, Pointer<Byte > pszName);
	public static native void OGR_STBL_ResetStyleStringReading(Pointer<? > hStyleTable);
	public static native Pointer<Byte > OGR_STBL_GetNextStyle(Pointer<? > hStyleTable);
	public static native Pointer<Byte > OGR_STBL_GetLastStyleName(Pointer<? > hStyleTable);
	/// Undefined type
	public static interface _IO_FILE {
		
	};
}
