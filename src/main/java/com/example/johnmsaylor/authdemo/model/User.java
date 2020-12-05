package com.example.johnmsaylor.authdemo.model;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class User {
    private String email;
    private String password;

    public User(String email, String password) {

        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
