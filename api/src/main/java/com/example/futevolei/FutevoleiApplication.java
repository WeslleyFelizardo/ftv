package com.example.futevolei;

import com.example.futevolei.entities.Athlete;
import com.example.futevolei.enums.PerfilEnum;
import com.example.futevolei.services.AthleteService;
import com.example.futevolei.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class FutevoleiApplication {


    public static void main(String[] args) {
        SpringApplication.run(FutevoleiApplication.class, args);
    }
}
