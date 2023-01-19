package com.gwordle.app.services;

import java.util.List;

import com.gwordle.app.models.Guess;
import com.gwordle.app.models.User;
import com.gwordle.app.models.UserProj;

public interface UserService {

    public void deleteUserById(Long id);

    public UserProj getUserById(Long id);

    public List<Guess> getUserGuessHistory();

    public List<User> getAllUsers();
    
    public List<UserProj> getAllUserProjs();

    public User updateUserById(Long id, User updatedUser);

    public User postUser(User user);
}
