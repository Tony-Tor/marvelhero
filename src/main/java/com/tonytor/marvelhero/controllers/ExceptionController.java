package com.tonytor.marvelhero.controllers;

import com.tonytor.marvelhero.utils.exceptions.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
class RestResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = { NotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "404 NOT FOUND: " + ex.getMessage();
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value
            = { ConstraintViolationException.class})
    protected ResponseEntity<Object> handleViolation(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "400 BAD REQUEST: " + ex.getMessage();
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
