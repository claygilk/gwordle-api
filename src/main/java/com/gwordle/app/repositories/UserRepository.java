package com.gwordle.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gwordle.app.models.User;
import com.gwordle.app.models.UserProj;


public interface UserRepository extends JpaRepository<User, Long> {
    
    @Modifying
    @Query("UPDATE User u SET u.email = ?#{user.email} WHERE u.id = ?#{id}")
    public void updateUserById(Long id, User user);


    @Query("SELECT new com.gwordle.app.models.UserProj(a.user_id, a.username, a.email) FROM User a WHERE a.user_id = :id")
    public UserProj findUserProj(Long id);

    @Query("SELECT new com.gwordle.app.models.UserProj(a.user_id, a.username, a.email) FROM User a")
    public List<UserProj> getAllUserProjs();
    
}
