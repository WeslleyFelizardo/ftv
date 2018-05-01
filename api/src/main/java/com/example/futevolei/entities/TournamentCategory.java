/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.entities;

import com.example.futevolei.entities.pk.TournamentCategoryPK;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author wfeli
 */
@Entity
@Table(name = "tournament_category")
public class TournamentCategory implements Serializable{

    @EmbeddedId
    private TournamentCategoryPK id;
    
    @Column(name = "created_on")
    private Date createdOn = new Date();
    
    @Column(name = "awards", nullable = true)
    private BigDecimal awards;
    
    @Column(name = "value_subscription", nullable = true)
    private BigDecimal valueSubscription;
    
    // Relacionamentos 
    
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("tournament_id")
    private Tournament tournament;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("category_id")
    private Category category;
    
    @OneToMany(mappedBy = "tournamentCategory", fetch = FetchType.LAZY)
    private List<Team> teams;

    public TournamentCategory(Tournament tournament, Category category) {
        this.tournament = tournament;
        this.category = category;
        this.id = new TournamentCategoryPK(tournament.getId(), category.getId());
    }

    
    public Tournament getTorTournament() {
        return tournament;
    }

    public void setTorTournament(Tournament torTournament) {
        this.tournament = torTournament;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public TournamentCategoryPK getId() {
        return id;
    }

    public void setId(TournamentCategoryPK id) {
        this.id = id;
    }

    public BigDecimal getAwards() {
        return awards;
    }

    public void setAwards(BigDecimal awards) {
        this.awards = awards;
    }

    public BigDecimal getValueSubscription() {
        return valueSubscription;
    }

    public void setValueSubscription(BigDecimal valueSubscription) {
        this.valueSubscription = valueSubscription;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.createdOn);
        hash = 89 * hash + Objects.hashCode(this.awards);
        hash = 89 * hash + Objects.hashCode(this.valueSubscription);
        hash = 89 * hash + Objects.hashCode(this.tournament);
        hash = 89 * hash + Objects.hashCode(this.category);
        hash = 89 * hash + Objects.hashCode(this.teams);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TournamentCategory other = (TournamentCategory) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.createdOn, other.createdOn)) {
            return false;
        }
        if (!Objects.equals(this.awards, other.awards)) {
            return false;
        }
        if (!Objects.equals(this.valueSubscription, other.valueSubscription)) {
            return false;
        }
        if (!Objects.equals(this.tournament, other.tournament)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.teams, other.teams)) {
            return false;
        }
        return true;
    }

    
   
    
    

}
