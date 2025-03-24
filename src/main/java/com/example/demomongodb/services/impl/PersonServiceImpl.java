package com.example.demomongodb.services.impl;

import com.example.demomongodb.dtos.PersonRequestDto;
import com.example.demomongodb.entities.Person;
import com.example.demomongodb.repositories.PersonRepository;
import com.example.demomongodb.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
    public ResponseEntity<Person> getPersonById(String id) {
        Optional<Person> existingPerson = personRepository.findById(id);
        return existingPerson.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Override
    public Person addPerson(PersonRequestDto personDto) {
        var person = Person.builder()
                .firstname(personDto.getFirstName())
                .lastname(personDto.getLastName())
                .telephones(personDto.getTelephones())
                .build();
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(String id, PersonRequestDto personDto) {
        Person existingPerson = personRepository.findById(id).get();
        existingPerson.setFirstname(personDto.getFirstName());
        existingPerson.setLastname(personDto.getLastName());
        existingPerson.setTelephones(personDto.getTelephones());
        return personRepository.save(existingPerson);
    }

    @Override
    public void deletePerson(String id) {
        Person existingPerson = personRepository.findById(id).get();
        personRepository.delete(existingPerson);
    }

    public Person update(String id, PersonRequestDto personDto) {
        return personRepository.findById(id)
                .map(person -> {
                    person.setFirstname(personDto.getFirstName());
                    person.setLastname(personDto.getLastName());
                    person.setTelephones(personDto.getTelephones());
                    return personRepository.save(person);
                }).orElse(null);
    }
}
