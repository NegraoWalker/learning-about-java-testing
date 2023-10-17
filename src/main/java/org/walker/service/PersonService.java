package org.walker.service;

import org.walker.model.Person;

public class PersonService implements PersonServiceInterface {
    @Override
    public Person createPerson(Person person) {
        return new Person();
    }
}
