package com.gwordle.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "solutions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Solution {
    
    @Id
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String word;

    @Getter @Setter
    private Boolean wasUsed;
}
