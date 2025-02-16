package com.praticas.gameslist.repositories;

import com.praticas.gameslist.entities.Game;
import com.praticas.gameslist.projection.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.game_title as title, tb_game.game_year AS `year`, tb_game.game_imgurl AS imgUrl,
		tb_game.game_short_description AS shortDescription, assoc_belonging.bel_position
		FROM tb_game
		INNER JOIN assoc_belonging ON tb_game.id = assoc_belonging.game_id
		WHERE assoc_belonging.list_id = :listId
		ORDER BY assoc_belonging.bel_position
			""")
	List<GameMinProjection> searchByList(Long listId);
}
