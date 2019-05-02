/*
 * This file is generated by jOOQ.
 */
package jooq.fancy.app.udt;


import javax.annotation.Generated;

import jooq.fancy.app.Public;
import jooq.fancy.app.udt.records.ValidDetailRecord;

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
public class ValidDetail extends UDTImpl<ValidDetailRecord> {

    private static final long serialVersionUID = 62846856;

    /**
     * The reference instance of <code>public.valid_detail</code>
     */
    public static final ValidDetail VALID_DETAIL = new ValidDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ValidDetailRecord> getRecordType() {
        return ValidDetailRecord.class;
    }

    /**
     * The attribute <code>public.valid_detail.valid</code>.
     */
    public static final UDTField<ValidDetailRecord, Boolean> VALID = createField("valid", org.jooq.impl.SQLDataType.BOOLEAN, VALID_DETAIL, "");

    /**
     * The attribute <code>public.valid_detail.reason</code>.
     */
    public static final UDTField<ValidDetailRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR, VALID_DETAIL, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final UDTField<ValidDetailRecord, Object> LOCATION = createField("location", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), VALID_DETAIL, "");

    /**
     * No further instances allowed
     */
    private ValidDetail() {
        super("valid_detail", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}
