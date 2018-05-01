/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.futevolei.entities.Tournament;
import com.example.futevolei.repositories.TournamentRepository;
import com.example.futevolei.services.AbstractService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wfeli
 */
@Service
public class TournamentService implements AbstractService<Tournament> {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Override
    public Tournament save(Tournament entity) {
        return tournamentRepository.save(entity);
    }

    @Override
    public Optional<Tournament> findById(Long id) {
        return tournamentRepository.findById(id);
    }

    @Override
    public void delete(Tournament entity) {
        tournamentRepository.delete(entity);
    }

    @Override
    public List<Tournament> findAll() {
        return tournamentRepository.findAll();
    }

}
