package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
  @Test
  void personTest(){
    System.out.println("Testing...");
    Person person = new Person("Jerry", 2003);
    person.setHeight(176);
    person.setWeight(63);
    double bmi = 63/(1.76*1.76);
    assertAll("Person",
            () -> assertEquals("Jerry",person.getName() ),
            () -> assertEquals(2003, person.getBirthYear()),
            () -> assertEquals(176, person.getHeight()),
            () -> assertEquals(63, person.getWeight()),
            () -> assertEquals(bmi, person.getBMI()),
            () -> assertEquals(20, person.getAge())
    );
  }
}