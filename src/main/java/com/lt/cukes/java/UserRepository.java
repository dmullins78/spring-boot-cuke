package com.lt.cukes.java;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private Map<Long, User> users = new HashMap<>();

    public User getUserById(Long id) {
        return users.get(id);
    }

    public void saveUser(User user) {
        users.put(user.id, user);
    }
}
