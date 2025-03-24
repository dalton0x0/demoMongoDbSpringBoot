package com.example.demomongodb.services;

import com.example.demomongodb.dtos.PersonRequestDto;
import com.example.demomongodb.entities.Person;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
    ResponseEntity<Person> getPersonById(String id);
    Person addPerson(PersonRequestDto personDto);
    Person updatePerson(String id,PersonRequestDto personDto);
    void deletePerson(String id);
}
