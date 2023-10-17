package org.walker.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.walker.model.Person;
import org.walker.service.PersonService;
import org.walker.service.PersonServiceInterface;

public class PersonServiceTest {
    @DisplayName("When Create a Person with Success Should Return a Person Object") //Quando criar uma pessoa com sucesso deve retornar um objeto Person
    @Test
    void testCreatePerson_When_Success_ShouldReturnPersonObject() {
        // Given / Arrange:
        PersonServiceInterface service = new PersonService();
        Person person = new Person("Walker","Negrão","Londrina - PR","Masculino","walker@gmail.com");
        // When / Act:
        Person actual = service.createPerson(person);
        // Then / Assert:
        Assertions.assertNotNull(actual,()-> "The createPerson() should not have returned null!");
    }

    @DisplayName("When Create a Person with Success Should Contains FirstName in Returned Person Object") //Quando criar uma pessoa com sucesso deve conter o primeiro nome no objeto Person retornado
    @Test
    void testCreatePerson_When_Success_ShouldContainsFirstNameInReturnedPersonObject(){
        // Given / Arrange:
        PersonServiceInterface service = new PersonService();
        Person person = new Person("Walker","Negrão","Londrina - PR","Masculino","walker@gmail.com");
        // When / Act:
        Person actual = service.createPerson(person);
        // Then / Assert:
        Assertions.assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FistName is Different!");
    }
}
