/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated;


import org.example.spring.tutorial.generated.tables.Person;
import org.example.spring.tutorial.generated.tables.records.PersonRecord;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PersonRecord, Integer> IDENTITY_PERSON = Identities0.IDENTITY_PERSON;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PersonRecord> PERSON_PKEY = UniqueKeys0.PERSON_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PersonRecord, Integer> IDENTITY_PERSON = Internal.createIdentity(Person.PERSON, Person.PERSON.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PersonRecord> PERSON_PKEY = Internal.createUniqueKey(Person.PERSON, "person_pkey", new TableField[] { Person.PERSON.ID }, true);
    }
}
