/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author wfeli
 */
@Entity
@Table(name = "team")
public class Team implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    // Relacionamentos
    
    @ManyToOne(fetch = FetchType.LAZY)
    private TournamentCategory tournamentCategory;

    @OneToOne
    private Athlete athleteOne;
    
    @OneToOne
    private Athlete athleteTwo;
    
    @ManyToOne
    private Group group;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TournamentCategory getTournamentCategory() {
        return tournamentCategory;
    }

    public void setTournamentCategory(TournamentCategory tournamentCategory) {
        this.tournamentCategory = tournamentCategory;
    }

    public Athlete getAthleteOne() {
        return athleteOne;
    }

    public void setAthleteOne(Athlete athleteOne) {
        this.athleteOne = athleteOne;
    }

    public Athlete getAthleteTwo() {
        return athleteTwo;
    }

    public void setAthleteTwo(Athlete athleteTwo) {
        this.athleteTwo = athleteTwo;
    }
}
