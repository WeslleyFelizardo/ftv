/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.controllers;

import com.example.futevolei.dtos.AthleteDto;
import com.example.futevolei.entities.Athlete;
import com.example.futevolei.enums.PerfilEnum;
import com.example.futevolei.services.AthleteService;
import com.example.futevolei.utils.ObjectMapperUtils;
import com.example.futevolei.utils.PasswordUtils;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/athlete")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @PostMapping
    public ResponseEntity<Athlete> save(@RequestBody Athlete athlete) {
        
        return ResponseEntity.ok(athleteService.save(athlete));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<AthleteDto> findById(@PathVariable("id") Long id) {
        
        AthleteDto athleteDto = ObjectMapperUtils.map(athleteService.findById(id).get(), AthleteDto.class);
        
        return ResponseEntity.ok(athleteDto);
    }
    
    @GetMapping
    public ResponseEntity<List<AthleteDto>> findAll() {
        
        List<AthleteDto> listAthlete = ObjectMapperUtils.mapAll(athleteService.findAll(), AthleteDto.class);
        
        return ResponseEntity.ok(listAthlete);
    }
    
}
