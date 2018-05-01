/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.services;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author wfeli
 */
public interface AbstractService<T> {
    
    T save(T entity);
    
    Optional<T> findById(Long id);
    
    void delete(T entity);
    
    List<T> findAll();
    
}
