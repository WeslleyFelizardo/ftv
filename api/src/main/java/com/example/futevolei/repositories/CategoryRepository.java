/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.repositories;
import com.example.futevolei.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author wfeli
 */
public interface CategoryRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor {
    
}