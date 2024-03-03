package com.example.myapplication.controller;

import com.example.myapplication.model.User;
import com.example.myapplication.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {

    private final UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    public UserResource(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(produces = "application/JSON")
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        logger.info("Get Users Total Users: " + users.size());
        return users;
    }

    @GetMapping(value = "/{id}", produces = "application/JSON")
    public Optional<User> findById(@PathVariable("id") Long userId) {
        logger.info("Get User By Id : " + userId);
        return userRepository.findById(userId);
    }
}
