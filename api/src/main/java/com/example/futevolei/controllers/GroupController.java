/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.controllers;

import com.example.futevolei.entities.Group;
import com.example.futevolei.services.GroupService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wfeli
 */
@RestController
@RequestMapping("/group")
public class GroupController {
    
    @Autowired
    private GroupService groupService;
    
    @GetMapping("/{idTournament}")
    public ResponseEntity<List<Group>> generateGroup(@PathVariable("idTournament") Long idTournament) {
        
        return ResponseEntity.ok(groupService.generateGroup(idTournament));
    }
    
    
}
