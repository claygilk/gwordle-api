package com.gwordle.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwordle.app.models.User;
import com.gwordle.app.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepo;

    @Override
    @Transactional
    public User saveUser(User user){
        System.out.println("UserServiceImpl is saving user: " + user.getUsername());
        return userRepo.saveUser(user);
    }

}
