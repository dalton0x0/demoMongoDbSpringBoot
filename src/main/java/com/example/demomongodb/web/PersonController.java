package com.example.demomongodb.web;

import com.example.demomongodb.entities.Person;
import com.example.demomongodb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
