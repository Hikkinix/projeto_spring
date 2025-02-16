package com.praticas.gameslist.controllers;

import com.praticas.gameslist.dto.game.GameCompleteResponse;
import com.praticas.gameslist.dto.game.GameResponse;
import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.repositories.GameRepository;
import com.praticas.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameRepository;

    @GetMapping
    public List<GameResponse> findAll() {
        return gameRepository.findAll();
    }

  @GetMapping(value = "/{id}")
    public GameCompleteResponse findById(@PathVariable Long id) {
        return gameRepository.findById(id);
    }


}
