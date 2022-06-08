package org.example.spring.tutorial.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.example.spring.tutorial.generated.tables.daos.PersonDao;
import org.example.spring.tutorial.generated.tables.pojos.Person;

import java.util.List;


@Service
@AllArgsConstructor
public class PersonService {
    private PersonDao personDao;

    public List<Person> getAllPersons() {
        personDao.fetchById(152);

        return personDao.findAll();
    }

}
