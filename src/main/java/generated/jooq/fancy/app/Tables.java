/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app;


import javax.annotation.Generated;

import jooq.fancy.app.tables.City;
import jooq.fancy.app.tables.FlywaySchemaHistory;
import jooq.fancy.app.tables.GeographyColumns;
import jooq.fancy.app.tables.GeometryColumns;
import jooq.fancy.app.tables.RasterColumns;
import jooq.fancy.app.tables.RasterOverviews;
import jooq.fancy.app.tables.SpatialRefSys;
import jooq.fancy.app.tables.StDump;
import jooq.fancy.app.tables.StDumpaspolygons;
import jooq.fancy.app.tables.StDumppoints;
import jooq.fancy.app.tables.StDumprings;
import jooq.fancy.app.tables.StDumpvalues;
import jooq.fancy.app.tables.StGdaldrivers;
import jooq.fancy.app.tables.StIntersection;
import jooq.fancy.app.tables.StMakeemptycoverage;
import jooq.fancy.app.tables.StPixelascentroids;
import jooq.fancy.app.tables.StPixelaspoints;
import jooq.fancy.app.tables.StPixelaspolygons;
import jooq.fancy.app.tables.StRetile;
import jooq.fancy.app.tables.StSubdivide;
import jooq.fancy.app.tables._StPixelaspolygons;
import jooq.fancy.app.tables.records.StDumpRecord;
import jooq.fancy.app.tables.records.StDumpaspolygonsRecord;
import jooq.fancy.app.tables.records.StDumppointsRecord;
import jooq.fancy.app.tables.records.StDumpringsRecord;
import jooq.fancy.app.tables.records.StDumpvaluesRecord;
import jooq.fancy.app.tables.records.StGdaldriversRecord;
import jooq.fancy.app.tables.records.StIntersectionRecord;
import jooq.fancy.app.tables.records.StMakeemptycoverageRecord;
import jooq.fancy.app.tables.records.StPixelascentroidsRecord;
import jooq.fancy.app.tables.records.StPixelaspointsRecord;
import jooq.fancy.app.tables.records.StPixelaspolygonsRecord;
import jooq.fancy.app.tables.records.StRetileRecord;
import jooq.fancy.app.tables.records.StSubdivideRecord;
import jooq.fancy.app.tables.records._StPixelaspolygonsRecord;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public._st_pixelaspolygons</code>.
     */
    public static final _StPixelaspolygons _ST_PIXELASPOLYGONS = jooq.fancy.app.tables._StPixelaspolygons._ST_PIXELASPOLYGONS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<_StPixelaspolygonsRecord> _ST_PIXELASPOLYGONS(Configuration configuration, Object rast, Integer band, Integer columnx, Integer rowy, Boolean excludeNodataValue) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables._StPixelaspolygons._ST_PIXELASPOLYGONS.call(rast, band, columnx, rowy, excludeNodataValue)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static _StPixelaspolygons _ST_PIXELASPOLYGONS(Object rast, Integer band, Integer columnx, Integer rowy, Boolean excludeNodataValue) {
        return jooq.fancy.app.tables._StPixelaspolygons._ST_PIXELASPOLYGONS.call(rast, band, columnx, rowy, excludeNodataValue);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static _StPixelaspolygons _ST_PIXELASPOLYGONS(Field<Object> rast, Field<Integer> band, Field<Integer> columnx, Field<Integer> rowy, Field<Boolean> excludeNodataValue) {
        return jooq.fancy.app.tables._StPixelaspolygons._ST_PIXELASPOLYGONS.call(rast, band, columnx, rowy, excludeNodataValue);
    }

    /**
     * The table <code>public.city</code>.
     */
    public static final City CITY = jooq.fancy.app.tables.City.CITY;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = jooq.fancy.app.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.geography_columns</code>.
     */
    public static final GeographyColumns GEOGRAPHY_COLUMNS = jooq.fancy.app.tables.GeographyColumns.GEOGRAPHY_COLUMNS;

    /**
     * The table <code>public.geometry_columns</code>.
     */
    public static final GeometryColumns GEOMETRY_COLUMNS = jooq.fancy.app.tables.GeometryColumns.GEOMETRY_COLUMNS;

    /**
     * The table <code>public.raster_columns</code>.
     */
    public static final RasterColumns RASTER_COLUMNS = jooq.fancy.app.tables.RasterColumns.RASTER_COLUMNS;

    /**
     * The table <code>public.raster_overviews</code>.
     */
    public static final RasterOverviews RASTER_OVERVIEWS = jooq.fancy.app.tables.RasterOverviews.RASTER_OVERVIEWS;

    /**
     * The table <code>public.spatial_ref_sys</code>.
     */
    public static final SpatialRefSys SPATIAL_REF_SYS = jooq.fancy.app.tables.SpatialRefSys.SPATIAL_REF_SYS;

    /**
     * The table <code>public.st_dump</code>.
     */
    public static final StDump ST_DUMP = jooq.fancy.app.tables.StDump.ST_DUMP;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumpRecord> ST_DUMP(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StDump.ST_DUMP.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDump ST_DUMP(Object __1) {
        return jooq.fancy.app.tables.StDump.ST_DUMP.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDump ST_DUMP(Field<Object> __1) {
        return jooq.fancy.app.tables.StDump.ST_DUMP.call(__1);
    }

    /**
     * The table <code>public.st_dumpaspolygons</code>.
     */
    public static final StDumpaspolygons ST_DUMPASPOLYGONS = jooq.fancy.app.tables.StDumpaspolygons.ST_DUMPASPOLYGONS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumpaspolygonsRecord> ST_DUMPASPOLYGONS(Configuration configuration, Object rast, Integer band, Boolean excludeNodataValue) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StDumpaspolygons.ST_DUMPASPOLYGONS.call(rast, band, excludeNodataValue)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumpaspolygons ST_DUMPASPOLYGONS(Object rast, Integer band, Boolean excludeNodataValue) {
        return jooq.fancy.app.tables.StDumpaspolygons.ST_DUMPASPOLYGONS.call(rast, band, excludeNodataValue);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumpaspolygons ST_DUMPASPOLYGONS(Field<Object> rast, Field<Integer> band, Field<Boolean> excludeNodataValue) {
        return jooq.fancy.app.tables.StDumpaspolygons.ST_DUMPASPOLYGONS.call(rast, band, excludeNodataValue);
    }

    /**
     * The table <code>public.st_dumppoints</code>.
     */
    public static final StDumppoints ST_DUMPPOINTS = jooq.fancy.app.tables.StDumppoints.ST_DUMPPOINTS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumppointsRecord> ST_DUMPPOINTS(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StDumppoints.ST_DUMPPOINTS.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumppoints ST_DUMPPOINTS(Object __1) {
        return jooq.fancy.app.tables.StDumppoints.ST_DUMPPOINTS.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumppoints ST_DUMPPOINTS(Field<Object> __1) {
        return jooq.fancy.app.tables.StDumppoints.ST_DUMPPOINTS.call(__1);
    }

    /**
     * The table <code>public.st_dumprings</code>.
     */
    public static final StDumprings ST_DUMPRINGS = jooq.fancy.app.tables.StDumprings.ST_DUMPRINGS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumpringsRecord> ST_DUMPRINGS(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StDumprings.ST_DUMPRINGS.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumprings ST_DUMPRINGS(Object __1) {
        return jooq.fancy.app.tables.StDumprings.ST_DUMPRINGS.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumprings ST_DUMPRINGS(Field<Object> __1) {
        return jooq.fancy.app.tables.StDumprings.ST_DUMPRINGS.call(__1);
    }

    /**
     * The table <code>public.st_dumpvalues</code>.
     */
    public static final StDumpvalues ST_DUMPVALUES = jooq.fancy.app.tables.StDumpvalues.ST_DUMPVALUES;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumpvaluesRecord> ST_DUMPVALUES(Configuration configuration, Object rast, Integer[] nband, Boolean excludeNodataValue) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StDumpvalues.ST_DUMPVALUES.call(rast, nband, excludeNodataValue)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumpvalues ST_DUMPVALUES(Object rast, Integer[] nband, Boolean excludeNodataValue) {
        return jooq.fancy.app.tables.StDumpvalues.ST_DUMPVALUES.call(rast, nband, excludeNodataValue);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumpvalues ST_DUMPVALUES(Field<Object> rast, Field<Integer[]> nband, Field<Boolean> excludeNodataValue) {
        return jooq.fancy.app.tables.StDumpvalues.ST_DUMPVALUES.call(rast, nband, excludeNodataValue);
    }

    /**
     * The table <code>public.st_gdaldrivers</code>.
     */
    public static final StGdaldrivers ST_GDALDRIVERS = jooq.fancy.app.tables.StGdaldrivers.ST_GDALDRIVERS;

    /**
     * Call <code>public.st_gdaldrivers</code>.
     */
    public static Result<StGdaldriversRecord> ST_GDALDRIVERS(Configuration configuration) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StGdaldrivers.ST_GDALDRIVERS.call()).fetch();
    }

    /**
     * Get <code>public.st_gdaldrivers</code> as a table.
     */
    public static StGdaldrivers ST_GDALDRIVERS() {
        return jooq.fancy.app.tables.StGdaldrivers.ST_GDALDRIVERS.call();
    }

    /**
     * The table <code>public.st_intersection</code>.
     */
    public static final StIntersection ST_INTERSECTION = jooq.fancy.app.tables.StIntersection.ST_INTERSECTION;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StIntersectionRecord> ST_INTERSECTION(Configuration configuration, Object geomin, Object rast, Integer band) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StIntersection.ST_INTERSECTION.call(geomin, rast, band)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StIntersection ST_INTERSECTION(Object geomin, Object rast, Integer band) {
        return jooq.fancy.app.tables.StIntersection.ST_INTERSECTION.call(geomin, rast, band);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StIntersection ST_INTERSECTION(Field<Object> geomin, Field<Object> rast, Field<Integer> band) {
        return jooq.fancy.app.tables.StIntersection.ST_INTERSECTION.call(geomin, rast, band);
    }

    /**
     * The table <code>public.st_makeemptycoverage</code>.
     */
    public static final StMakeemptycoverage ST_MAKEEMPTYCOVERAGE = jooq.fancy.app.tables.StMakeemptycoverage.ST_MAKEEMPTYCOVERAGE;

    /**
     * Call <code>public.st_makeemptycoverage</code>.
     */
    public static Result<StMakeemptycoverageRecord> ST_MAKEEMPTYCOVERAGE(Configuration configuration, Integer tilewidth, Integer tileheight, Integer width, Integer height, Double upperleftx, Double upperlefty, Double scalex, Double scaley, Double skewx, Double skewy, Integer srid) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StMakeemptycoverage.ST_MAKEEMPTYCOVERAGE.call(tilewidth, tileheight, width, height, upperleftx, upperlefty, scalex, scaley, skewx, skewy, srid)).fetch();
    }

    /**
     * Get <code>public.st_makeemptycoverage</code> as a table.
     */
    public static StMakeemptycoverage ST_MAKEEMPTYCOVERAGE(Integer tilewidth, Integer tileheight, Integer width, Integer height, Double upperleftx, Double upperlefty, Double scalex, Double scaley, Double skewx, Double skewy, Integer srid) {
        return jooq.fancy.app.tables.StMakeemptycoverage.ST_MAKEEMPTYCOVERAGE.call(tilewidth, tileheight, width, height, upperleftx, upperlefty, scalex, scaley, skewx, skewy, srid);
    }

    /**
     * Get <code>public.st_makeemptycoverage</code> as a table.
     */
    public static StMakeemptycoverage ST_MAKEEMPTYCOVERAGE(Field<Integer> tilewidth, Field<Integer> tileheight, Field<Integer> width, Field<Integer> height, Field<Double> upperleftx, Field<Double> upperlefty, Field<Double> scalex, Field<Double> scaley, Field<Double> skewx, Field<Double> skewy, Field<Integer> srid) {
        return jooq.fancy.app.tables.StMakeemptycoverage.ST_MAKEEMPTYCOVERAGE.call(tilewidth, tileheight, width, height, upperleftx, upperlefty, scalex, scaley, skewx, skewy, srid);
    }

    /**
     * The table <code>public.st_pixelascentroids</code>.
     */
    public static final StPixelascentroids ST_PIXELASCENTROIDS = jooq.fancy.app.tables.StPixelascentroids.ST_PIXELASCENTROIDS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StPixelascentroidsRecord> ST_PIXELASCENTROIDS(Configuration configuration, Object rast, Integer band, Boolean excludeNodataValue) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StPixelascentroids.ST_PIXELASCENTROIDS.call(rast, band, excludeNodataValue)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StPixelascentroids ST_PIXELASCENTROIDS(Object rast, Integer band, Boolean excludeNodataValue) {
        return jooq.fancy.app.tables.StPixelascentroids.ST_PIXELASCENTROIDS.call(rast, band, excludeNodataValue);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StPixelascentroids ST_PIXELASCENTROIDS(Field<Object> rast, Field<Integer> band, Field<Boolean> excludeNodataValue) {
        return jooq.fancy.app.tables.StPixelascentroids.ST_PIXELASCENTROIDS.call(rast, band, excludeNodataValue);
    }

    /**
     * The table <code>public.st_pixelaspoints</code>.
     */
    public static final StPixelaspoints ST_PIXELASPOINTS = jooq.fancy.app.tables.StPixelaspoints.ST_PIXELASPOINTS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StPixelaspointsRecord> ST_PIXELASPOINTS(Configuration configuration, Object rast, Integer band, Boolean excludeNodataValue) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StPixelaspoints.ST_PIXELASPOINTS.call(rast, band, excludeNodataValue)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StPixelaspoints ST_PIXELASPOINTS(Object rast, Integer band, Boolean excludeNodataValue) {
        return jooq.fancy.app.tables.StPixelaspoints.ST_PIXELASPOINTS.call(rast, band, excludeNodataValue);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StPixelaspoints ST_PIXELASPOINTS(Field<Object> rast, Field<Integer> band, Field<Boolean> excludeNodataValue) {
        return jooq.fancy.app.tables.StPixelaspoints.ST_PIXELASPOINTS.call(rast, band, excludeNodataValue);
    }

    /**
     * The table <code>public.st_pixelaspolygons</code>.
     */
    public static final StPixelaspolygons ST_PIXELASPOLYGONS = jooq.fancy.app.tables.StPixelaspolygons.ST_PIXELASPOLYGONS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StPixelaspolygonsRecord> ST_PIXELASPOLYGONS(Configuration configuration, Object rast, Integer band, Boolean excludeNodataValue) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StPixelaspolygons.ST_PIXELASPOLYGONS.call(rast, band, excludeNodataValue)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StPixelaspolygons ST_PIXELASPOLYGONS(Object rast, Integer band, Boolean excludeNodataValue) {
        return jooq.fancy.app.tables.StPixelaspolygons.ST_PIXELASPOLYGONS.call(rast, band, excludeNodataValue);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StPixelaspolygons ST_PIXELASPOLYGONS(Field<Object> rast, Field<Integer> band, Field<Boolean> excludeNodataValue) {
        return jooq.fancy.app.tables.StPixelaspolygons.ST_PIXELASPOLYGONS.call(rast, band, excludeNodataValue);
    }

    /**
     * The table <code>public.st_retile</code>.
     */
    public static final StRetile ST_RETILE = jooq.fancy.app.tables.StRetile.ST_RETILE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StRetileRecord> ST_RETILE(Configuration configuration, Object tab, String col, Object ext, Double sfx, Double sfy, Integer tw, Integer th, String algo) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StRetile.ST_RETILE.call(tab, col, ext, sfx, sfy, tw, th, algo)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StRetile ST_RETILE(Object tab, String col, Object ext, Double sfx, Double sfy, Integer tw, Integer th, String algo) {
        return jooq.fancy.app.tables.StRetile.ST_RETILE.call(tab, col, ext, sfx, sfy, tw, th, algo);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StRetile ST_RETILE(Field<Object> tab, Field<String> col, Field<Object> ext, Field<Double> sfx, Field<Double> sfy, Field<Integer> tw, Field<Integer> th, Field<String> algo) {
        return jooq.fancy.app.tables.StRetile.ST_RETILE.call(tab, col, ext, sfx, sfy, tw, th, algo);
    }

    /**
     * The table <code>public.st_subdivide</code>.
     */
    public static final StSubdivide ST_SUBDIVIDE = jooq.fancy.app.tables.StSubdivide.ST_SUBDIVIDE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StSubdivideRecord> ST_SUBDIVIDE(Configuration configuration, Object geom, Integer maxvertices) {
        return configuration.dsl().selectFrom(jooq.fancy.app.tables.StSubdivide.ST_SUBDIVIDE.call(geom, maxvertices)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StSubdivide ST_SUBDIVIDE(Object geom, Integer maxvertices) {
        return jooq.fancy.app.tables.StSubdivide.ST_SUBDIVIDE.call(geom, maxvertices);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StSubdivide ST_SUBDIVIDE(Field<Object> geom, Field<Integer> maxvertices) {
        return jooq.fancy.app.tables.StSubdivide.ST_SUBDIVIDE.call(geom, maxvertices);
    }
}
