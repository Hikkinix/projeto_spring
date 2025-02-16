package com.praticas.gameslist.dto.game;

import com.praticas.gameslist.entities.Game;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

public class GameCompleteResponse implements Serializable {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String score;
    private String platform;
    private String imgUrl;
    private String description;
    private String descriptionDetail;


    public GameCompleteResponse() {
    }

    public GameCompleteResponse(Game game) {
        BeanUtils.copyProperties(game, this );
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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

    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    public void setDescriptionDetail(String descriptionDetail) {
        this.descriptionDetail = descriptionDetail;
    }
}
