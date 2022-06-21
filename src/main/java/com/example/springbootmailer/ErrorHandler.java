package com.example.springbootmailer;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> get(RuntimeException e, WebRequest webRequest) {
        String response = "Twoje imie jest za krotkie";
        System.out.println(e.getStackTrace());
        return handleExceptionInternal(e, response, HttpHeaders.EMPTY, HttpStatus.CONFLICT, webRequest);
    }

}
