package com.praticas.gameslist.repositories;

import com.praticas.gameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
