package com.gwordle.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gwordle.app.models.Solution;
import com.gwordle.app.repositories.SolutionRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private SolutionRepository repo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello From MyCommandLineRunner");
        System.out.println("Adding test record to database");
        repo.saveAndFlush(new Solution(999L, "proof", false));
    }
}