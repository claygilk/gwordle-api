package com.gwordle.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwordle.app.models.Solution;
import com.gwordle.app.repositories.SolutionRepository;
import com.gwordle.app.exceptions.SolutionNotFoundException;

@RestController
@RequestMapping("/api/v1/solutions")
public class SolutionController {

    
    @Autowired
    private SolutionRepository solutionRepository;

    @GetMapping("{id}")
    public Solution getWordById(@PathVariable Long id){
        return this.solutionRepository.findById(id)
        .orElseThrow(() -> new SolutionNotFoundException(id));
    }
    
    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Solution> getAllSolutions() {
        
        return this.solutionRepository.findAll();
    
    }

    @PostMapping
    public void addSolution(@RequestBody Solution solution){
        this.solutionRepository.saveAndFlush(solution);
    }

    @PutMapping("{id}")
    public Solution updateSolution(@RequestBody Solution newSolution, @PathVariable Long id){
        return solutionRepository.findById(id).map(s -> {
            s.setWas_used(newSolution.getWas_used());
            System.out.println(s);
            System.out.println(s.getWas_used());
            return solutionRepository.saveAndFlush(s);
        }).orElseGet(() -> {
            newSolution.setId(id);
            return solutionRepository.saveAndFlush(newSolution);
        });
    }
}
