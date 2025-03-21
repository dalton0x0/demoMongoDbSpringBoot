package com.example.demomongodb.services.impl;

import com.example.demomongodb.entities.Person;
import com.example.demomongodb.repositories.PersonRepository;
import com.example.demomongodb.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
