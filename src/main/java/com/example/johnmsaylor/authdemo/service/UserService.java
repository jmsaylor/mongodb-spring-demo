package com.example.johnmsaylor.authdemo.service;


import com.example.johnmsaylor.authdemo.model.User;
import com.example.johnmsaylor.authdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }
}
