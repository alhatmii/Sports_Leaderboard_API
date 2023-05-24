package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
