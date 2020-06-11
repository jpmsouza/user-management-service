package com.usermanagement.rest.userservice.utils;

import com.usermanagement.rest.userservice.utils.constants.ResponseMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityExistsException;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityExistsException.class)
    public ResponseEntity<Object> handleEntityExists(EntityExistsException ex){
        return new ResponseEntity<>(Utils.builderBodyResponse(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                ResponseMessages.REGISTER_ALREADY_EXIST
        ), HttpStatus.BAD_REQUEST);
    }
}
