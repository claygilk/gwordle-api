package com.gwordle.app.repositories;

import org.springframework.stereotype.Repository;

import com.gwordle.app.models.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public User saveUser(User user){
        
        entityManager.persist(user);
        return user;
    }
}
