package com.example.demomongodb.web;

import com.example.demomongodb.dtos.PersonRequestDto;
import com.example.demomongodb.entities.Person;
import com.example.demomongodb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/test")
    public String testApi() {
        return "Test API OK";
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody PersonRequestDto personDto) {
        return personService.addPerson(personDto);
    }

    @PutMapping("/update/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody PersonRequestDto personDto) {
        return personService.updatePerson(id, personDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }
}
