package com.example.johnmsaylor.authdemo.controller;

import com.example.johnmsaylor.authdemo.model.User;
import com.example.johnmsaylor.authdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpResponse;
import java.util.List;

@RestController()
public class Controller {

    @Autowired
    UserService service;

    @PostMapping("/")
    public User createUser(@RequestParam String email, @RequestParam String password) {
        User newUser = new User(email, password);
        return newUser;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }
}
