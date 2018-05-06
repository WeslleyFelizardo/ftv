/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.exceptions;

import org.hibernate.annotations.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author wfeli
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFound extends RuntimeException {

    public EntityNotFound(String message) {
        super(message);
    }
    
}
