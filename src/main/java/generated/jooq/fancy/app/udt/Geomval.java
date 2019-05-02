/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.udt;


import javax.annotation.Generated;

import jooq.fancy.app.Public;
import jooq.fancy.app.udt.records.GeomvalRecord;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;


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
public class Geomval extends UDTImpl<GeomvalRecord> {

    private static final long serialVersionUID = -511928160;

    /**
     * The reference instance of <code>public.geomval</code>
     */
    public static final Geomval GEOMVAL = new Geomval();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GeomvalRecord> getRecordType() {
        return GeomvalRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final UDTField<GeomvalRecord, Object> GEOM = createField("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), GEOMVAL, "");

    /**
     * The attribute <code>public.geomval.val</code>.
     */
    public static final UDTField<GeomvalRecord, Double> VAL = createField("val", org.jooq.impl.SQLDataType.DOUBLE, GEOMVAL, "");

    /**
     * No further instances allowed
     */
    private Geomval() {
        super("geomval", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}
