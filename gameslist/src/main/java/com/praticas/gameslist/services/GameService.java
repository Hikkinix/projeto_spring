package com.praticas.gameslist.services;

import com.praticas.gameslist.dto.game.GameCompleteResponse;
import com.praticas.gameslist.dto.game.GameResponse;

import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameResponse> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(GameResponse::new).toList();
    }

    @Transactional(readOnly = true)
    public GameCompleteResponse findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameCompleteResponse(result);
    }

    @Transactional(readOnly = true)
    public List<GameResponse> findByList(Long listId) {
        var result = gameRepository.searchByList(listId);
        return result.stream().map(GameResponse::new).toList();
    }

}
