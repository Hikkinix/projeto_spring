package com.praticas.gameslist.dto.game;

import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.entities.ListGames;

import java.io.Serializable;

public class ListGameResponse implements Serializable {

    private Long id;
    private String name;

    public ListGameResponse() {
    }

    public ListGameResponse(ListGames game) {
        this.id = game.getId();
        this.name = game.getName();
    }

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
}