package com.gwordle.app.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwordle.app.models.Guess;
import com.gwordle.app.models.User;
import com.gwordle.app.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepo;

    @Override
    @Transactional
    public User postUser(User user){
        return userRepo.saveAndFlush(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public List<Guess> getUserGuessHistory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User updateUserById(Long id, User updatedUser) {
        userRepo.updateUserById(id, updatedUser);
        return userRepo.findById(id).orElseThrow(() -> new NoSuchElementException());
    }


}
