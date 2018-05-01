/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.repositories;

import com.example.futevolei.entities.Athlete;
import java.util.Optional;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author wfeli
 */
public interface AthleteRepository extends JpaRepository<Athlete, Long>, JpaSpecificationExecutor {
    
    Optional<Athlete> findByEmail(String email);
    
}
