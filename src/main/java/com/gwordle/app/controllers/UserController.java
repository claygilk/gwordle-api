package com.gwordle.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gwordle.app.models.Guess;
import com.gwordle.app.models.User;
import com.gwordle.app.models.UserProj;
import com.gwordle.app.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User postUser(@RequestBody User user){
        logger.info("Creating new user...");
        logger.info(user.toString());
        return userService.postUser(user);
    }

    @GetMapping
    public List<UserProj> getAllUsers(){
        logger.info("Getting all Users...");
        return userService.getAllUserProjs();
    }

    @GetMapping("{id}")
    public UserProj getUserById(@PathVariable Long id){
        logger.info("Getting user. id = " + id);
        return userService.getUserById(id);
    }

    @GetMapping("{id}/history")
    public List<Guess> getUserGuessHistory(@PathVariable Long id){
        logger.info("Getting user guess history");
        return userService.getUserGuessHistory(id);
    }

    @PutMapping("{id}")
    public User updateUserById(@PathVariable Long id, @RequestBody User updatedUser){
        logger.info("Updating user by Id");
        return userService.updateUserById(id, updatedUser);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable Long id){
        logger.info("Deleting user by Id");
        userService.deleteUserById(id);
    }
}
