package com.praticas.gameslist.repositories;

import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.entities.ListGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ListGameRepository extends JpaRepository<ListGames, Long> {

//    @Modifying
//    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
//    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
