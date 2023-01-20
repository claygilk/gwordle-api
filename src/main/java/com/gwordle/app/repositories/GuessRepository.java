package com.gwordle.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gwordle.app.models.Guess;

public interface GuessRepository extends JpaRepository<Guess, Long> {   
}
