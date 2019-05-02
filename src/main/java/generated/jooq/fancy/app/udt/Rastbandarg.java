/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.udt;


import javax.annotation.Generated;

import jooq.fancy.app.Public;
import jooq.fancy.app.udt.records.RastbandargRecord;

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
public class Rastbandarg extends UDTImpl<RastbandargRecord> {

    private static final long serialVersionUID = 1973712291;

    /**
     * The reference instance of <code>public.rastbandarg</code>
     */
    public static final Rastbandarg RASTBANDARG = new Rastbandarg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RastbandargRecord> getRecordType() {
        return RastbandargRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final UDTField<RastbandargRecord, Object> RAST = createField("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"raster\""), RASTBANDARG, "");

    /**
     * The attribute <code>public.rastbandarg.nband</code>.
     */
    public static final UDTField<RastbandargRecord, Integer> NBAND = createField("nband", org.jooq.impl.SQLDataType.INTEGER, RASTBANDARG, "");

    /**
     * No further instances allowed
     */
    private Rastbandarg() {
        super("rastbandarg", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}