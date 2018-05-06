/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.dtos;

import java.util.Date;

/**
 *
 * @author wfeli
 */
public class TournamentDto {
    
    private Long id;
    private String name;
    private String description;
    private Integer amountTeam;
    private Date startDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmountTeam() {
        return amountTeam;
    }

    public void setAmountTeam(Integer amountTeam) {
        this.amountTeam = amountTeam;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
}
