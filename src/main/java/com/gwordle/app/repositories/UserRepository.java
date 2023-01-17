package com.gwordle.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gwordle.app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    @Modifying
    @Query("UPDATE User u SET u.email = ?#{user.email} WHERE u.id = ?#{id}")
    public void updateUserById(Long id, User user);
}
