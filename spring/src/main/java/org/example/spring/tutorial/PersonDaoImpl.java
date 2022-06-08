package org.example.spring.tutorial;

import lombok.AllArgsConstructor;
import org.example.spring.tutorial.generated.tables.daos.PersonDao;
import org.example.spring.tutorial.generated.tables.pojos.Person;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static org.example.spring.tutorial.generated.tables.Person.PERSON;

@Repository
@AllArgsConstructor
public class PersonDaoImpl extends PersonDao {
    private final DSLContext jooq;

    public Person getActiveByIdd(Integer idd) {
        return jooq.select(PERSON.fields())
                .from(PERSON)
                .where(PERSON.IDD.eq(idd))
                .fetchOneInto(Person.class);
    }
}
