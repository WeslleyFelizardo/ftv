/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.controllers;

import com.example.futevolei.entities.Game;
import com.example.futevolei.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wfeli
 */
@RestController
@RequestMapping("/game")
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @PostMapping
    public void updateResult(Game game) {
        
    }
}
