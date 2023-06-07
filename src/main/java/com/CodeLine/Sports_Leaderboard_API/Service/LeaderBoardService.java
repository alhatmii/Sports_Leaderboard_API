package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import com.CodeLine.Sports_Leaderboard_API.Repository.LeaderBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LeaderBoardService {
    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    public void createLeaderBoard() {
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName("RDF");
        leaderBoard.setWins(1);
        leaderBoard.setLosses(0);
        leaderBoard.setCreatedDate(new Date());
        leaderBoard.setIsActive(true);
        leaderBoardRepository.save(leaderBoard);
    }

    public LeaderBoard getLeaderBoardById(Integer id) {
        LeaderBoard leaderBoardById = leaderBoardRepository.getLeaderBoardById(id);
        return leaderBoardById;
    }
}

