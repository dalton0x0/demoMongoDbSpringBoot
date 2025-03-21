package com.example.demomongodb.services.impl;

import com.example.demomongodb.dtos.PersonRequestDto;
import com.example.demomongodb.entities.Person;
import com.example.demomongodb.repositories.PersonRepository;
import com.example.demomongodb.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }

    @Override
    public Person addPerson(PersonRequestDto personDto) {
        var person = Person.builder()
                .firstName(personDto.getFirstName())
                .lastName(personDto.getLastName())
                .telephones(personDto.getTelephones())
                .build();
        return personRepository.save(person);
    }
}
