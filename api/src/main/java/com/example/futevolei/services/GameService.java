/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.services;

import com.example.futevolei.entities.Game;
import com.example.futevolei.entities.Group;
import com.example.futevolei.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wfeli
 */
@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    @Autowired
    private SetGameService setGameService;
    
    public void generateGames(List<Group> groups) {
        
    }
    
    public void updateResult(Game game) {
        setGameService.fillResult(game);
    }
    
}
