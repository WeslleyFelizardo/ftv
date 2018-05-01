/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.services;


import com.example.futevolei.entities.Athlete;
import com.example.futevolei.repositories.AthleteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wfeli
 */
@Service
public class AthleteService implements AbstractService<Athlete> {

    @Autowired
    private AthleteRepository athleteRepository;
    
    @Override
    public Athlete save(Athlete entity) {
        return athleteRepository.save(entity);
    }

    @Override
    public Optional<Athlete> findById(Long id) {
        return athleteRepository.findById(id);
    }

    @Override
    public void delete(Athlete entity) {
        athleteRepository.delete(entity);
    }

    @Override
    public List<Athlete> findAll() {
        return athleteRepository.findAll();
    }

    public Optional<Athlete> getByEmail(String email) {
        return athleteRepository.findByEmail(email);
    }
    
}
