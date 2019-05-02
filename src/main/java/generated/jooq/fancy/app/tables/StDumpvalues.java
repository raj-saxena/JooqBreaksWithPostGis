/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.tables;


import javax.annotation.Generated;

import jooq.fancy.app.Public;
import jooq.fancy.app.tables.records.StDumpvaluesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class StDumpvalues extends TableImpl<StDumpvaluesRecord> {

    private static final long serialVersionUID = 365447519;

    /**
     * The reference instance of <code>public.st_dumpvalues</code>
     */
    public static final StDumpvalues ST_DUMPVALUES = new StDumpvalues();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StDumpvaluesRecord> getRecordType() {
        return StDumpvaluesRecord.class;
    }

    /**
     * The column <code>public.st_dumpvalues.nband</code>.
     */
    public final TableField<StDumpvaluesRecord, Integer> NBAND = createField("nband", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_dumpvalues.valarray</code>.
     */
    public final TableField<StDumpvaluesRecord, Double[]> VALARRAY = createField("valarray", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), this, "");

    /**
     * Create a <code>public.st_dumpvalues</code> table reference
     */
    public StDumpvalues() {
        this(DSL.name("st_dumpvalues"), null);
    }

    /**
     * Create an aliased <code>public.st_dumpvalues</code> table reference
     */
    public StDumpvalues(String alias) {
        this(DSL.name(alias), ST_DUMPVALUES);
    }

    /**
     * Create an aliased <code>public.st_dumpvalues</code> table reference
     */
    public StDumpvalues(Name alias) {
        this(alias, ST_DUMPVALUES);
    }

    private StDumpvalues(Name alias, Table<StDumpvaluesRecord> aliased) {
        this(alias, aliased, new Field[3]);
    }

    private StDumpvalues(Name alias, Table<StDumpvaluesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StDumpvalues(Table<O> child, ForeignKey<O, StDumpvaluesRecord> key) {
        super(child, key, ST_DUMPVALUES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumpvalues as(String alias) {
        return new StDumpvalues(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumpvalues as(Name alias) {
        return new StDumpvalues(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumpvalues rename(String name) {
        return new StDumpvalues(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumpvalues rename(Name name) {
        return new StDumpvalues(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StDumpvalues call(Object rast, Integer[] nband, Boolean excludeNodataValue) {
        return new StDumpvalues(DSL.name(getName()), null, new Field[] { 
              DSL.val(rast, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"raster\""))
            , DSL.val(nband, org.jooq.impl.SQLDataType.INTEGER.getArrayDataType())
            , DSL.val(excludeNodataValue, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)))
        });
    }

    /**
     * Call this table-valued function
     */
    public StDumpvalues call(Field<Object> rast, Field<Integer[]> nband, Field<Boolean> excludeNodataValue) {
        return new StDumpvalues(DSL.name(getName()), null, new Field[] { 
              rast
            , nband
            , excludeNodataValue
        });
    }
}
