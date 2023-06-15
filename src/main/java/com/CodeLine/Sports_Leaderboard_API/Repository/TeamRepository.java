package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// To indicate that the Class is repository component
@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    // To write the Query for SQL database
    // To show Teams by ID as parameter
    @Query(value = "select t from Team t where t.id=:teamId")
    public Team getTeamById(@Param("teamId") Integer id);
}
