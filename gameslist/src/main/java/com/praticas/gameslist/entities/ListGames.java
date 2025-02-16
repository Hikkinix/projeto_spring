package com.praticas.gameslist.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "list_games")
public class ListGames implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mg_id")
    private Long id;
    @Column(name = "mg_name")
    private String name;

    public ListGames() {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListGames myGames = (ListGames) o;
        return Objects.equals(id, myGames.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
