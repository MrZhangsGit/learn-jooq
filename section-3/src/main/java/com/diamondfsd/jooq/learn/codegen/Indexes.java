/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen;


import com.diamondfsd.jooq.learn.codegen.tables.TS1User;
import com.diamondfsd.jooq.learn.codegen.tables.TS2UserMessage;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>learn-jooq</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index S1_USER_PRIMARY = Indexes0.S1_USER_PRIMARY;
    public static final Index S2_USER_MESSAGE_PRIMARY = Indexes0.S2_USER_MESSAGE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index S1_USER_PRIMARY = Internal.createIndex("PRIMARY", TS1User.S1_USER, new OrderField[] { TS1User.S1_USER.ID }, true);
        public static Index S2_USER_MESSAGE_PRIMARY = Internal.createIndex("PRIMARY", TS2UserMessage.S2_USER_MESSAGE, new OrderField[] { TS2UserMessage.S2_USER_MESSAGE.ID }, true);
    }
}
