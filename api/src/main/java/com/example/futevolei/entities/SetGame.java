/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author wfeli
 */
@Entity
@Table(name = "set_game")
public class SetGame implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "awards_team_one", nullable = false)
    private Integer awardsTeamOne;
    @Column(name = "awards_team_two", nullable = false)
    private Integer awardsTeamTwo;
    
    // Relacionamentos
    
    @ManyToOne
    private Game game;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Integer getAwardsTeamOne() {
        return awardsTeamOne;
    }

    public void setAwardsTeamOne(Integer awardsTeamOne) {
        this.awardsTeamOne = awardsTeamOne;
    }

    public Integer getAwardsTeamTwo() {
        return awardsTeamTwo;
    }

    public void setAwardsTeamTwo(Integer awardsTeamTwo) {
        this.awardsTeamTwo = awardsTeamTwo;
    }
    
    
    
}
