package com.gwordle.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@Entity
@Table(name = "wordle_guesses")
public class Guess {

    // test comment other stuff
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String word;

    @Column(name = "guess_number")
    private Integer guessNumber;

    @Column(name = "session_id")
    private Long sessionId;
}
