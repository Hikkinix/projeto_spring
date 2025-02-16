package com.praticas.gameslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "assoc_belonging")
public class Belongin {

    @EmbeddedId
    private BelonginPK id = new BelonginPK();
    @Column(name = "bel_position")
    private Integer position;

    public Belongin() {
    }

    public Belongin(Game game, ListGames myGames, Integer position) {
        this.id = new BelonginPK(game, myGames);
        this.position = position;
    }

    public BelonginPK getId() {
        return id;
    }

    public void setId(BelonginPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
