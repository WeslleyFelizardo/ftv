/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.repositories;

import com.example.futevolei.entities.SetGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author wfeli
 */
public interface SetGameRepository extends JpaRepository<SetGame, Long>, JpaSpecificationExecutor {
    
}
