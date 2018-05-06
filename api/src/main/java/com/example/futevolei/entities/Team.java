/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @Column(name = "status", nullable = false)
    private String status;
    
    // Relacionamentos
    
    @ManyToOne(fetch = FetchType.LAZY)
    private TournamentCategory tournamentCategory;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "athlete_one_id", updatable = false, insertable = false )
    private Athlete athleteOne;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "athlete_two_id", updatable = false, insertable = false)
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    
    
}
