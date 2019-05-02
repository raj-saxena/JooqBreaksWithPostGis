/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.tables.records;


import javax.annotation.Generated;

import jooq.fancy.app.tables.StGdaldrivers;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class StGdaldriversRecord extends TableRecordImpl<StGdaldriversRecord> implements Record6<Integer, String, String, Boolean, Boolean, String> {

    private static final long serialVersionUID = -2143680937;

    /**
     * Setter for <code>public.st_gdaldrivers.idx</code>.
     */
    public StGdaldriversRecord setIdx(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.st_gdaldrivers.idx</code>.
     */
    public Integer getIdx() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.st_gdaldrivers.short_name</code>.
     */
    public StGdaldriversRecord setShortName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.st_gdaldrivers.short_name</code>.
     */
    public String getShortName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.st_gdaldrivers.long_name</code>.
     */
    public StGdaldriversRecord setLongName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.st_gdaldrivers.long_name</code>.
     */
    public String getLongName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.st_gdaldrivers.can_read</code>.
     */
    public StGdaldriversRecord setCanRead(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.st_gdaldrivers.can_read</code>.
     */
    public Boolean getCanRead() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.st_gdaldrivers.can_write</code>.
     */
    public StGdaldriversRecord setCanWrite(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.st_gdaldrivers.can_write</code>.
     */
    public Boolean getCanWrite() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.st_gdaldrivers.create_options</code>.
     */
    public StGdaldriversRecord setCreateOptions(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.st_gdaldrivers.create_options</code>.
     */
    public String getCreateOptions() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Boolean, Boolean, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Boolean, Boolean, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StGdaldrivers.ST_GDALDRIVERS.IDX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StGdaldrivers.ST_GDALDRIVERS.SHORT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StGdaldrivers.ST_GDALDRIVERS.LONG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return StGdaldrivers.ST_GDALDRIVERS.CAN_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return StGdaldrivers.ST_GDALDRIVERS.CAN_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StGdaldrivers.ST_GDALDRIVERS.CREATE_OPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLongName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getCanRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getCanWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCreateOptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLongName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getCanRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getCanWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreateOptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord value1(Integer value) {
        setIdx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord value2(String value) {
        setShortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord value3(String value) {
        setLongName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord value4(Boolean value) {
        setCanRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord value5(Boolean value) {
        setCanWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord value6(String value) {
        setCreateOptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldriversRecord values(Integer value1, String value2, String value3, Boolean value4, Boolean value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StGdaldriversRecord
     */
    public StGdaldriversRecord() {
        super(StGdaldrivers.ST_GDALDRIVERS);
    }

    /**
     * Create a detached, initialised StGdaldriversRecord
     */
    public StGdaldriversRecord(Integer idx, String shortName, String longName, Boolean canRead, Boolean canWrite, String createOptions) {
        super(StGdaldrivers.ST_GDALDRIVERS);

        set(0, idx);
        set(1, shortName);
        set(2, longName);
        set(3, canRead);
        set(4, canWrite);
        set(5, createOptions);
    }
}