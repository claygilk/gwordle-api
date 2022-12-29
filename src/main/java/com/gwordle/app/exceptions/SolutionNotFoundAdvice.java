package com.gwordle.app.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class SolutionNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(SolutionNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String SolutionNotFoundHandler(SolutionNotFoundException ex) {
    return ex.getMessage();
  }
}
