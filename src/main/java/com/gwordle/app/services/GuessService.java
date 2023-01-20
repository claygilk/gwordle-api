package com.gwordle.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwordle.app.models.Guess;
import com.gwordle.app.repositories.GuessRepository;

@Service
public class GuessService {

    @Autowired
    private GuessRepository guessRepo;

    public Guess submitGuess(Guess guess){
        return guessRepo.saveAndFlush(guess);
    }
}
