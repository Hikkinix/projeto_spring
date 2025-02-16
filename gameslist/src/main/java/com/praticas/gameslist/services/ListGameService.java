package com.praticas.gameslist.services;

import com.praticas.gameslist.dto.game.GameCompleteResponse;
import com.praticas.gameslist.dto.game.GameResponse;
import com.praticas.gameslist.dto.game.ListGameResponse;
import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.repositories.GameRepository;
import com.praticas.gameslist.repositories.ListGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListGameService {

    @Autowired
    private ListGameRepository listGameRepository;

    @Transactional(readOnly = true)
    public List<ListGameResponse> findAll() {
        var result = listGameRepository.findAll();
        return result.stream().map(ListGameResponse::new).toList();
    }

    @Transactional(readOnly = true)
    public ListGameResponse findById(Long id) {
        var result = listGameRepository.findById(id).get();
        return new ListGameResponse(result);
    }

}
