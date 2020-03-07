package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

import java.util.UUID;

public class Person  {

    private final UUID id;
    @NotBlank
    private final String firstName;


    public Person(@JsonProperty("id")  UUID id,
                  @JsonProperty("name") String firstName) {
        this.id = id;
        this.firstName = firstName;

    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

}
