package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard,Integer> {
    @Query(value = "select l from LeaderBoard l where l.id= :id")
    LeaderBoard getLeaderBoardById(@Param("id") Integer id);

    @Query(value = "select l from LeaderBoard l order by l.wins")
    List<LeaderBoard> getLeaderBoardByWins();
}
