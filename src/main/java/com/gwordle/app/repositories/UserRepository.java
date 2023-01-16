package com.gwordle.app.repositories;

import com.gwordle.app.models.User;

public interface UserRepository {
    public User saveUser(User user);
}
