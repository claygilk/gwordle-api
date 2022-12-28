package com.gwordle.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwordle.app.models.Solution;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
    
}
