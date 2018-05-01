/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.controllers;

import com.example.futevolei.entities.Athlete;
import com.example.futevolei.enums.PerfilEnum;
import com.example.futevolei.services.AthleteService;
import com.example.futevolei.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    public void save() {
        Athlete athlete = new Athlete();

        athlete.setEmail("test@gmail.com");
        athlete.setUserName("test@gmail.com");
        athlete.setPermission(PerfilEnum.ROLE_ADMIN);
        athlete.setPassword(PasswordUtils.gerarBCrypt("123456"));
        athlete.setMobileNumber("911134296");
        athlete.setName("Weslley");
        athlete.setNickName("teste");
        
        athleteService.save(athlete);

    }
    
}
