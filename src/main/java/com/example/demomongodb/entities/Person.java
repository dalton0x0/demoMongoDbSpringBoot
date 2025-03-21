package com.example.demomongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "person")
public class Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private List<String> telephones;
}
