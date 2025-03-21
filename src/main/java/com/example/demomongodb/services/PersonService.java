package com.example.demomongodb.services;

import com.example.demomongodb.entities.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
}
