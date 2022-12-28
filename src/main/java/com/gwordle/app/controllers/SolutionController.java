package com.gwordle.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwordle.app.models.Solution;
import com.gwordle.app.repositories.SolutionRepository;

@RestController
@RequestMapping("/api/v1/solutions")
public class SolutionController {

    
    @Autowired
    private SolutionRepository solutionRepository;

    @GetMapping
    @RequestMapping("{id}")
    public Solution getWordById(@PathVariable Long id){

        return this.solutionRepository.getReferenceById(id);
    }
    
    @GetMapping
    @RequestMapping("/")
    public List<Solution> getAllSolutions() {
        
        return this.solutionRepository.findAll();
    
    }

    @PostMapping("/")
    public void addSolution(@RequestBody Solution solution){
        this.solutionRepository.saveAndFlush(solution);
    }
}
