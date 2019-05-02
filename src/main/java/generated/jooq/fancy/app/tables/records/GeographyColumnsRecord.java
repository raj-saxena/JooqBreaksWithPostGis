/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.tables.records;


import javax.annotation.Generated;

import jooq.fancy.app.tables.GeographyColumns;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeographyColumnsRecord extends TableRecordImpl<GeographyColumnsRecord> implements Record7<String, String, String, String, Integer, Integer, String> {

    private static final long serialVersionUID = 1559270651;

    /**
     * Setter for <code>public.geography_columns.f_table_catalog</code>.
     */
    public GeographyColumnsRecord setFTableCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.f_table_catalog</code>.
     */
    public String getFTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.geography_columns.f_table_schema</code>.
     */
    public GeographyColumnsRecord setFTableSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.f_table_schema</code>.
     */
    public String getFTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.geography_columns.f_table_name</code>.
     */
    public GeographyColumnsRecord setFTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.f_table_name</code>.
     */
    public String getFTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.geography_columns.f_geography_column</code>.
     */
    public GeographyColumnsRecord setFGeographyColumn(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.f_geography_column</code>.
     */
    public String getFGeographyColumn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.geography_columns.coord_dimension</code>.
     */
    public GeographyColumnsRecord setCoordDimension(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.coord_dimension</code>.
     */
    public Integer getCoordDimension() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.geography_columns.srid</code>.
     */
    public GeographyColumnsRecord setSrid(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.srid</code>.
     */
    public Integer getSrid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.geography_columns.type</code>.
     */
    public GeographyColumnsRecord setType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.geography_columns.type</code>.
     */
    public String getType() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Integer, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Integer, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.F_TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.F_TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.F_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.F_GEOGRAPHY_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.COORD_DIMENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.SRID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GeographyColumns.GEOGRAPHY_COLUMNS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getFTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFGeographyColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCoordDimension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getSrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFGeographyColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCoordDimension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value1(String value) {
        setFTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value2(String value) {
        setFTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value3(String value) {
        setFTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value4(String value) {
        setFGeographyColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value5(Integer value) {
        setCoordDimension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value6(Integer value) {
        setSrid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord value7(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumnsRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GeographyColumnsRecord
     */
    public GeographyColumnsRecord() {
        super(GeographyColumns.GEOGRAPHY_COLUMNS);
    }

    /**
     * Create a detached, initialised GeographyColumnsRecord
     */
    public GeographyColumnsRecord(String fTableCatalog, String fTableSchema, String fTableName, String fGeographyColumn, Integer coordDimension, Integer srid, String type) {
        super(GeographyColumns.GEOGRAPHY_COLUMNS);

        set(0, fTableCatalog);
        set(1, fTableSchema);
        set(2, fTableName);
        set(3, fGeographyColumn);
        set(4, coordDimension);
        set(5, srid);
        set(6, type);
    }
}
