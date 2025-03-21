package com.example.demomongodb.dtos;

import lombok.Data;

import java.util.List;

@Data
public class PersonRequestDto {
    private String firstName;
    private String lastName;
    private List<String> telephones;
}
