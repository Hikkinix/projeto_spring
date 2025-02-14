package com.praticas.gameslist.dto.game;

import com.praticas.gameslist.entities.Game;

import java.io.Serializable;

public class GameResponse implements Serializable {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String description;

    public GameResponse() {
    }

    public GameResponse(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear()  ;
        this.imgUrl = game.getImgUrl();
        this.description = game.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
