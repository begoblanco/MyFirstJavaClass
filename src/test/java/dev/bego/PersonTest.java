package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person1 = new Person("Miku", "Hatsune", "3939-A", 2007, "Japan", 'F');
    Person person2 = new Person("Kiara", "Takanashi", "3069-B", 1995, "Austria", 'F');


    @Test
    void testFirstName() {
        assertEquals("Miku", person1.getFirstName());
        assertEquals("Kiara", person2.getFirstName());
    }

    @Test
    void testLastName() {
        assertEquals("Hatsune", person1.getLastName());
        assertEquals("Takanashi", person2.getLastName());
    }
    
    @Test
    void testIdNumber() {
        assertEquals("3939-A", person1.getIdNumber());
        assertEquals("3069-B", person2.getIdNumber());
    }

    @Test
    void testBirthYear() {
        assertEquals(2007, person1.getBirthYear());
        assertEquals(1995, person2.getBirthYear());
    }

    @Test
    void testBirthCountry() {
        assertEquals("Japan", person1.getBirthCountry());
        assertEquals("Austria", person2.getBirthCountry());
    }

    @Test
    void testGender() {
        assertEquals('F', person1.getGender());
        assertEquals('F', person2.getGender());
    }
}
