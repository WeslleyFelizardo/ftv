/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.services;

import com.example.futevolei.entities.Team;
import com.example.futevolei.repositories.TeamRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wfeli
 */
@Service
public class TeamService implements AbstractService<Team>{

    @Autowired
    private TeamRepository teamRepository;
    
    @Override
    public Team save(Team entity) {
        return teamRepository.save(entity);
    }

    @Override
    public Optional<Team> findById(Long id) {
        return teamRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        teamRepository.deleteById(id);
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }
    
    public List<Team> findAllByTournament(Long idTournament) {
        
        return teamRepository.findAll();
    }
}
