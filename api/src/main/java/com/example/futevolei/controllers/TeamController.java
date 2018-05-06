/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.controllers;

import com.example.futevolei.entities.Team;
import com.example.futevolei.services.TeamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wfeli
 */
@RestController
@RequestMapping("/team")
public class TeamController {
    
    @Autowired
    private TeamService teamService;
    
    
    @PostMapping
    public ResponseEntity<Team> save(@RequestBody Team team) {
        
        return ResponseEntity.ok(teamService.save(team));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Team> findById(@PathVariable("id") Long id) {

        return ResponseEntity.ok(teamService.findById(id).get());
    }
    
    @GetMapping
    public ResponseEntity<List<Team>> findAll() {
        
        return ResponseEntity.ok(teamService.findAll());
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        teamService.delete(id);
    }
    
    @GetMapping("/{idTournament}")
    public ResponseEntity<List<Team>> findAllByTournament(@PathVariable("idTournament") Long idTournament) {
        
        return ResponseEntity.ok(teamService.findAllByTournament(idTournament));
    }
    
}
