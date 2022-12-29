package com.gwordle.app.exceptions;

public class SolutionNotFoundException extends RuntimeException {

    public SolutionNotFoundException(Long id) {
      super("Could not find Solution " + id);
    }
  }
