package com.innowise.darya.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class EntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ThereIsNoSuchException.class)
    protected ResponseEntity<?> handleThereIsNoSuchBookException(ThereIsNoSuchException exception) {

        return new ResponseEntity<>("There is no such " + exception.getFieldName(), HttpStatus.NOT_FOUND);
    }
}
