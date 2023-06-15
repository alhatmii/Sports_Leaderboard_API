package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import com.CodeLine.Sports_Leaderboard_API.Repository.LeaderBoardRepository;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.LeaderBoardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

// Used to mark the Class as Service Component, To write the all methods required from the class to perform
// responsible for processing and coordinating business logic
@Service
public class LeaderBoardService {

    // To Automatically Wire dependencies.
    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    // Method to create a Board Game and store it in the Database
    public void createLeaderBoard(LeaderBoardRequest leaderBoardRequest) {
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName(leaderBoardRequest.getTeamName());
        leaderBoard.setWins(leaderBoardRequest.getWins());
        leaderBoard.setLosses(leaderBoardRequest.getLosses());
        leaderBoard.setCreatedDate(new Date());
        leaderBoard.setIsActive(true);
        leaderBoardRepository.save(leaderBoard);
    }

    // Method to show all saved LeaderBoard (Scores) that stored in the Database
    public LeaderBoard getLeaderBoardById(Integer id) {
        LeaderBoard leaderBoardById = leaderBoardRepository.getLeaderBoardById(id);
        return leaderBoardById;
    }

    // Method to show all saved LeaderBoard (Scores) by wins that stored in the Database
    public List<LeaderBoard> getLeaderBoardOrderByWins(){
        List<LeaderBoard> leaderBoardOrderByWins = leaderBoardRepository.getLeaderBoardByWins();
        return leaderBoardOrderByWins;
    }
}

