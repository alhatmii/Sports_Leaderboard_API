package com.CodeLine.Sports_Leaderboard_API.RequestObject;


import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter

public class LeaderBoardRequest {
    Integer leaderBoardId;
    String teamName;
    Integer wins;
    Integer losses;
    public static LeaderBoard convertLeaderBoardToRequest(LeaderBoardRequest request){
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName(request.getTeamName());
        leaderBoard.setWins(request.getWins());
        leaderBoard.setLosses(request.getLosses());
        leaderBoard.setCreatedDate(new Date());
        leaderBoard.setIsActive(true);
        return leaderBoard;

    }
    public static List<LeaderBoard> convertListToLeaderBoardRequest(List<LeaderBoardRequest> LeaderBoardRequestList){
        List<LeaderBoard> LeaderBoardList = new ArrayList<>();
        if (!LeaderBoardRequestList.isEmpty()) {
            for (LeaderBoardRequest leaderBoardRequest : LeaderBoardRequestList) {
                LeaderBoardList.add(convertLeaderBoardToRequest(leaderBoardRequest));
            }
        }
        return LeaderBoardList;

    }
}
