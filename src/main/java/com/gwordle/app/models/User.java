package com.gwordle.app.models;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @NotBlank
    private String username;

    @NotBlank
    private String password; // WARNING! Unencrypted!

    @NotBlank
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Guess> guessHistory;

}
