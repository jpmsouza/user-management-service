package com.usermanagement.rest.userservice.exceptions;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ExceptionResponse {
    private LocalDateTime timestamp;
    private int statusCode;
    private String error;
    private String message;

    public ExceptionResponse(LocalDateTime timestamp, int statusCode, String error, String message){
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
    }
}
