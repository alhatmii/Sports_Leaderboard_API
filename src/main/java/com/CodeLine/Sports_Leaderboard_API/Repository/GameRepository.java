package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// To indicate that the Class is repository component
@Repository
public interface GameRepository extends JpaRepository <Game, Integer> {

    // To write the Query for SQL database
    // To show GameID as parameter
    @Query(value = "select g from Game g where g.id= :id")
    Game getGameById(@Param("id") Integer id);

    // To write the Query for SQL database
    // To show All games stored in DataBase
    @Query("select g from Game g")
    List<Game> getAllGame();
}
