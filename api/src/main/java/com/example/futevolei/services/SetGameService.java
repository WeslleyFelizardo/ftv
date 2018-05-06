/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.services;

import com.example.futevolei.entities.Game;
import com.example.futevolei.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wfeli
 */
@Service
public class SetGameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    public void fillResult(Game game) {
        
        
        
    }
    
}
