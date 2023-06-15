package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// To indicate that the Class is repository component
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    // To write the Query for SQL database
    // To show All Players
    @Query(value = "select s from Player s")
    List<Player> getAllPlayer();

    // To write the Query for SQL database
    // To show Player by ID as parameter
    @Query(value = "select m from Player m where m.id= :id")
    Player getPlayerId(@Param("id") Integer id);


}

