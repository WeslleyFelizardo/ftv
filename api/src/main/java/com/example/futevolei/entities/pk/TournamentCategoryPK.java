        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.entities.pk;


import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author wfeli
 */
@Embeddable
public class TournamentCategoryPK implements Serializable {
    
    @Column(name = "tournament_id")
    private Long tournamentId;
 
    @Column(name = "category_id")
    private Long categoryId;

    public TournamentCategoryPK(Long tournamentId, Long categoryId) {
        this.tournamentId = tournamentId;
        this.categoryId = categoryId;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.tournamentId);
        hash = 67 * hash + Objects.hashCode(this.categoryId);
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
        final TournamentCategoryPK other = (TournamentCategoryPK) obj;
        if (!Objects.equals(this.tournamentId, other.tournamentId)) {
            return false;
        }
        if (!Objects.equals(this.categoryId, other.categoryId)) {
            return false;
        }
        return true;
    }
    
    
 
}
