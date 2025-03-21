package com.example.demomongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "person")
@Builder
public class Person {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private List<String> telephones;
}
