package com.gwordle.app.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wordle_guesses")
public class Guess {

    // test comment other stuff
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guess_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; 

    private String word;

    @Column(name = "guess_number")
    private Integer guessNumber;

    @Column(name = "session_id")
    private Long sessionId;
}
