package com.gwordle.app.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ControllerAdviceHandler {

  @ResponseBody
  @ExceptionHandler(SolutionNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String SolutionNotFoundHandler(SolutionNotFoundException ex) {
    return ex.getMessage();
  }

  @ResponseBody
  @ExceptionHandler(ConstraintViolationException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String userObjectIncompleteHandler(ConstraintViolationException ex){
    return "User data is incomplete. The following fields are required: username, email and password.";
  }
}
