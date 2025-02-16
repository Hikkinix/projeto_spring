package com.praticas.gameslist.controllers;

import com.praticas.gameslist.dto.game.GameCompleteResponse;
import com.praticas.gameslist.dto.game.GameResponse;
import com.praticas.gameslist.dto.game.ListGameResponse;
import com.praticas.gameslist.services.GameService;
import com.praticas.gameslist.services.ListGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListGameController {

    @Autowired
    private ListGameService listGameService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<ListGameResponse> findAll() {
        return listGameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ListGameResponse findById(@PathVariable Long id) {
        return listGameService.findById(id);
    }

    @GetMapping(value = "/{id}/games")
    public List<GameResponse> findByList(@PathVariable Long id) {
        return gameService.findByList(id);
    }


}
