package com.example.newsmedia.controllers;

import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.User;
import com.example.newsmedia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController("/users")
public class UserController {
    // Controller for user related operations
    private final UserService userService;

//    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        // Add a user
        return userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable String id) throws ResourceNotFoundException {
        // Fetch a user
        UUID userId = UUID.fromString(id);
        return userService.fetchUserById(userId);
    }
    @GetMapping("/users")
    public List<User> fetchAllUsers() {
        // fetch all users
        return userService.fetchAllUsers();
    }
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id) throws ResourceNotFoundException {
        // Delete a user
        UUID userId = UUID.fromString(id);
        userService.deleteUser(userId);
        return "SUCCESS";
    }
}
