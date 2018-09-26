package com.lt.cukes.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @RequestMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return repository.getUserById(userId);
    }

}
