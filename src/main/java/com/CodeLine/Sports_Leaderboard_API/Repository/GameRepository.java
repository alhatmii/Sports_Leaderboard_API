package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository <Game, Integer> {
    @Query(value = "select g from Game g where g.id= :id")
    Game getGameById(@Param("id") Integer id);
}
