package org.walker.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.walker.model.Person;
import org.walker.service.PersonService;
import org.walker.service.PersonServiceInterface;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FistName is Different!");
    }

    @DisplayName("When Create a Person with Success Should Contains Valid Fields in Returned Person Object")
    @Test
    void testCreatePerson_When_Success_ShouldContainsValidFieldsInReturnedPersonObject() {

        // Given / Arrange
        PersonServiceInterface service = new PersonService();

        Person person = new Person("Walker","Negrão","Londrina - PR","Masculino","walker@gmail.com");
        // When / Act:
        Person actual = service.createPerson(person);

        // Then / Assert
        assertNotNull(person.getId(),()-> "Person ID is missing!");
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The Person FistName is Incorrect!");
        assertEquals(person.getLastName(), actual.getLastName(), () -> "The Person LastName is Incorrect!");
        assertEquals(person.getAddress(), actual.getAddress(), () -> "The Person Address is Incorrect!");
        assertEquals(person.getGender(), actual.getGender(), () -> "The Person Gender is Incorrect!");
        assertEquals(person.getEmail(), actual.getEmail(), () -> "The Person Email is Incorrect!");
    }

    @DisplayName("When Create a Person with null e-Mail Should throw Exception")
    @Test
    void testCreatePerson_WhithNullEMail_ShouldThrowIllegalArgumentException() {
        // Given / Arrange
        PersonServiceInterface service = new PersonService();
        Person person = new Person();
        person.setEmail(null);
        // When / Act
        // Then / Assert
        var exception = assertThrows(IllegalArgumentException.class, () -> service.createPerson(person), () -> "Empty e-Mail should have cause an IllegalArgumentException!");
        assertEquals("The Person e-Mail is null or empty!",exception.getMessage(),()-> "Exception error message is incorrect!");
    }
}
