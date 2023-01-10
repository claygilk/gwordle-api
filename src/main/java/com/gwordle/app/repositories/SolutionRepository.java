package com.gwordle.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gwordle.app.models.Solution;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
    
    @Query(value = "select * from solutions where is_todays_wordle = 't';", nativeQuery = true)
    public Solution findTodaysWordle();
}
