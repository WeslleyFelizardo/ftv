/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.exceptions;

import java.util.Date;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author wfeli
 */
@ControllerAdvice
public class HandlerExceptions {

    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<?> handlerExceptionNotFound(EntityNotFound exception) {
        
        ResponseError responseError = new ResponseError();
        
        responseError.setClientMessage(exception.getMessage());
        responseError.setDetails(exception.getMessage());
        responseError.setTimestamp(new Date().getTime());
        responseError.setTitle("Registro não encontrado");
        responseError.setStatus(HttpStatus.NOT_FOUND.value());
        
        return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
    }
    
    //other exception handlers below
}
