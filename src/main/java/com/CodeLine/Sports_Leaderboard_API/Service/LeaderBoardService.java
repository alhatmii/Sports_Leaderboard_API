package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import com.CodeLine.Sports_Leaderboard_API.Repository.LeaderBoardRepository;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.LeaderBoardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LeaderBoardService {
    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    public void createLeaderBoard(LeaderBoardRequest leaderBoardRequest) {
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName(leaderBoardRequest.getTeamName());
        leaderBoard.setWins(leaderBoardRequest.getWins());
        leaderBoard.setLosses(leaderBoardRequest.getLosses());
        leaderBoard.setCreatedDate(new Date());
        leaderBoard.setIsActive(true);
        leaderBoardRepository.save(leaderBoard);
    }

    public LeaderBoard getLeaderBoardById(Integer id) {
        LeaderBoard leaderBoardById = leaderBoardRepository.getLeaderBoardById(id);
        return leaderBoardById;
    }
    public List<LeaderBoard> getLeaderBoardOrderByWins(){
        List<LeaderBoard> leaderBoardOrderByWins = leaderBoardRepository.getLeaderBoardByWins();
        return leaderBoardOrderByWins;
    }
}

