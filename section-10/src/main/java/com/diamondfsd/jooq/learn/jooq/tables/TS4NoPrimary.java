/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq.tables;


import com.diamondfsd.jooq.learn.jooq.LearnJooq;
import com.diamondfsd.jooq.learn.jooq.tables.records.S4NoPrimaryRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TS4NoPrimary extends TableImpl<S4NoPrimaryRecord> {

    private static final long serialVersionUID = -2102451864;

    /**
     * The reference instance of <code>learn-jooq.s4_no_primary</code>
     */
    public static final TS4NoPrimary S4_NO_PRIMARY = new TS4NoPrimary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<S4NoPrimaryRecord> getRecordType() {
        return S4NoPrimaryRecord.class;
    }

    /**
     * The column <code>learn-jooq.s4_no_primary.column1</code>. 测试列1
     */
    public final TableField<S4NoPrimaryRecord, String> COLUMN1 = createField(DSL.name("column1"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "测试列1");

    /**
     * The column <code>learn-jooq.s4_no_primary.column2</code>. 测试列2
     */
    public final TableField<S4NoPrimaryRecord, String> COLUMN2 = createField(DSL.name("column2"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "测试列2");

    /**
     * The column <code>learn-jooq.s4_no_primary.create_time</code>. 创建时间
     */
    public final TableField<S4NoPrimaryRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>learn-jooq.s4_no_primary.update_time</code>. 更新时间
     */
    public final TableField<S4NoPrimaryRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>learn-jooq.s4_no_primary</code> table reference
     */
    public TS4NoPrimary() {
        this(DSL.name("s4_no_primary"), null);
    }

    /**
     * Create an aliased <code>learn-jooq.s4_no_primary</code> table reference
     */
    public TS4NoPrimary(String alias) {
        this(DSL.name(alias), S4_NO_PRIMARY);
    }

    /**
     * Create an aliased <code>learn-jooq.s4_no_primary</code> table reference
     */
    public TS4NoPrimary(Name alias) {
        this(alias, S4_NO_PRIMARY);
    }

    private TS4NoPrimary(Name alias, Table<S4NoPrimaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TS4NoPrimary(Name alias, Table<S4NoPrimaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TS4NoPrimary(Table<O> child, ForeignKey<O, S4NoPrimaryRecord> key) {
        super(child, key, S4_NO_PRIMARY);
    }

    @Override
    public Schema getSchema() {
        return LearnJooq.LEARN_JOOQ;
    }

    @Override
    public TS4NoPrimary as(String alias) {
        return new TS4NoPrimary(DSL.name(alias), this);
    }

    @Override
    public TS4NoPrimary as(Name alias) {
        return new TS4NoPrimary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TS4NoPrimary rename(String name) {
        return new TS4NoPrimary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TS4NoPrimary rename(Name name) {
        return new TS4NoPrimary(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}