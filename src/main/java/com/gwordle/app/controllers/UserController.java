package com.gwordle.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwordle.app.models.User;
import com.gwordle.app.services.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("Saving user: " + user.getUsername());

        userService.saveUser(user);

        return user;
    }
}
