/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public interface IS4UnionKey extends Serializable {

    /**
     * Setter for <code>learn-jooq.s4_union_key.uk_1</code>. 联合ID1
     */
    public void setUk_1(Integer value);

    /**
     * Getter for <code>learn-jooq.s4_union_key.uk_1</code>. 联合ID1
     */
    public Integer getUk_1();

    /**
     * Setter for <code>learn-jooq.s4_union_key.uk_2</code>. 联合ID2
     */
    public void setUk_2(Integer value);

    /**
     * Getter for <code>learn-jooq.s4_union_key.uk_2</code>. 联合ID2
     */
    public Integer getUk_2();

    /**
     * Setter for <code>learn-jooq.s4_union_key.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value);

    /**
     * Getter for <code>learn-jooq.s4_union_key.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime();

    /**
     * Setter for <code>learn-jooq.s4_union_key.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value);

    /**
     * Getter for <code>learn-jooq.s4_union_key.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IS4UnionKey
     */
    public void from(com.diamondfsd.jooq.learn.jooq.tables.interfaces.IS4UnionKey from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IS4UnionKey
     */
    public <E extends com.diamondfsd.jooq.learn.jooq.tables.interfaces.IS4UnionKey> E into(E into);
}
