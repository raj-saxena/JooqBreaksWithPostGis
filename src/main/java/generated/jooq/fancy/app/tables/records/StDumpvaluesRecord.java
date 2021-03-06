/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.tables.records;


import javax.annotation.Generated;

import jooq.fancy.app.tables.StDumpvalues;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class StDumpvaluesRecord extends TableRecordImpl<StDumpvaluesRecord> implements Record2<Integer, Double[]> {

    private static final long serialVersionUID = -398206124;

    /**
     * Setter for <code>public.st_dumpvalues.nband</code>.
     */
    public StDumpvaluesRecord setNband(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.st_dumpvalues.nband</code>.
     */
    public Integer getNband() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.st_dumpvalues.valarray</code>.
     */
    public StDumpvaluesRecord setValarray(Double... value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.st_dumpvalues.valarray</code>.
     */
    public Double[] getValarray() {
        return (Double[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Double[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Double[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StDumpvalues.ST_DUMPVALUES.NBAND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double[]> field2() {
        return StDumpvalues.ST_DUMPVALUES.VALARRAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getNband();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double[] component2() {
        return getValarray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNband();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double[] value2() {
        return getValarray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumpvaluesRecord value1(Integer value) {
        setNband(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumpvaluesRecord value2(Double... value) {
        setValarray(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumpvaluesRecord values(Integer value1, Double[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StDumpvaluesRecord
     */
    public StDumpvaluesRecord() {
        super(StDumpvalues.ST_DUMPVALUES);
    }

    /**
     * Create a detached, initialised StDumpvaluesRecord
     */
    public StDumpvaluesRecord(Integer nband, Double[] valarray) {
        super(StDumpvalues.ST_DUMPVALUES);

        set(0, nband);
        set(1, valarray);
    }
}
