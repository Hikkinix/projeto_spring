package com.praticas.gameslist.services;

import com.praticas.gameslist.dto.game.GameResponse;
import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameResponse> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(GameResponse::new).toList();
    }

}
