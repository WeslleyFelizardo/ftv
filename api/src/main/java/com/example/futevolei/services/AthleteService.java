/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.services;

import com.example.exceptions.EntityNotFound;
import com.example.futevolei.entities.Athlete;
import com.example.futevolei.enums.PermissionEnum;
import com.example.futevolei.repositories.AthleteRepository;
import com.example.futevolei.utils.PasswordUtils;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

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

        entity.setPassword(PasswordUtils.gerarBCrypt(entity.getPassword()));
        entity.setPermission(PermissionEnum.ROLE_USUARIO);
        
        return athleteRepository.save(entity);
    }

    @Override
    public Optional<Athlete> findById(Long id) {

        Optional<Athlete> athlete = Optional.empty();

        athlete = athleteRepository.findById(id);

        if (!athlete.isPresent())
                throw new EntityNotFound("O atleta não foi encontrado");

        return athlete;
    }

    @Override
    public void delete(Long id) {
        athleteRepository.deleteById(id);
    }

    @Override
    public List<Athlete> findAll() {
        return athleteRepository.findAll();
    }

    public Optional<Athlete> getByEmail(String email) {
        return athleteRepository.findByEmail(email);
    }

}
