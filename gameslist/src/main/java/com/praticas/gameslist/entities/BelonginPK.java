package com.praticas.gameslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelonginPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private ListGames myGames;

    public BelonginPK() {
    }

    public BelonginPK(Game game, ListGames myGames) {
        this.game = game;
        this.myGames = myGames;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ListGames getMyGames() {
        return myGames;
    }

    public void setMyGames(ListGames myGames) {
        this.myGames = myGames;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelonginPK that = (BelonginPK) o;
        return Objects.equals(game, that.game) && Objects.equals(myGames, that.myGames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, myGames);
    }
}
