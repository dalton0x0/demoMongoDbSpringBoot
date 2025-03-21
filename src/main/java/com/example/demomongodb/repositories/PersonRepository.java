package com.example.demomongodb.repositories;

import com.example.demomongodb.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
