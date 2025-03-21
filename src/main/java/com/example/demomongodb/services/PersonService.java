package com.example.demomongodb.services;

import com.example.demomongodb.dtos.PersonRequestDto;
import com.example.demomongodb.entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getAllPersons();
    Optional<Person> getPersonById(String id);
    Person addPerson(PersonRequestDto personDto);
}
