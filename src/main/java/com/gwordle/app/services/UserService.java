package com.gwordle.app.services;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gwordle.app.models.Guess;
import com.gwordle.app.models.User;

public interface UserService {

    public void deleteUserById(Long id);

    public User getUserById(Long id);

    public List<Guess> getUserGuessHistory();

    public List<User> getAllUsers();

    public User updateUserById(Long id, User updatedUser);

    public User postUser(User user);
}
