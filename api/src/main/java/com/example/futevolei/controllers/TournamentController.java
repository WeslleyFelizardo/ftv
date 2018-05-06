/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.controllers;

import com.example.futevolei.dtos.AthleteDto;
import com.example.futevolei.dtos.TournamentDto;
import com.example.futevolei.entities.Athlete;
import com.example.futevolei.entities.Tournament;
import com.example.futevolei.services.TournamentService;
import com.example.futevolei.utils.ObjectMapperUtils;
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
@RequestMapping("/tournament")
public class TournamentController {
 
    @Autowired
    private TournamentService tournamentService;
    
    
    @PostMapping
    public ResponseEntity<Tournament> save(@RequestBody Tournament tournament) {
        
        return ResponseEntity.ok(tournamentService.save(tournament));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TournamentDto> findById(@PathVariable("id") Long id) {
        
        TournamentDto tournamentDto = ObjectMapperUtils.map(tournamentService.findById(id).get(), TournamentDto.class);
        
        return ResponseEntity.ok(tournamentDto);
    }
    
    @GetMapping
    public ResponseEntity<List<TournamentDto>> findAll() {
        
        List<TournamentDto> listTournament = ObjectMapperUtils.mapAll(tournamentService.findAll(), TournamentDto.class);
        
        return ResponseEntity.ok(listTournament);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tournamentService.delete(id);
    }
}
