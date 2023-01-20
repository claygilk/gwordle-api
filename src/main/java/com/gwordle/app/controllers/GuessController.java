package com.gwordle.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gwordle.app.models.Guess;
import com.gwordle.app.services.GuessService;

@RestController
@RequestMapping("/api/v1/guess")
public class GuessController {

    @Autowired
    private GuessService guessService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Guess submitGuess(@RequestBody Guess guess){
        return guessService.submitGuess(guess);
    }


}
