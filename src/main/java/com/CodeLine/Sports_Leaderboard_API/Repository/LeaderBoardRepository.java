package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// To indicate that the Class is repository component
@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard,Integer> {

    // To write the Query for SQL database
    // To show LeaderBoard by ID as parameter
    @Query(value = "select l from LeaderBoard l where l.id= :id")
    LeaderBoard getLeaderBoardById(@Param("id") Integer id);

    // To write the Query for SQL database
    // To show LeaderBoard By Wins
    @Query(value = "select l from LeaderBoard l order by l.wins")
    List<LeaderBoard> getLeaderBoardByWins();
}
