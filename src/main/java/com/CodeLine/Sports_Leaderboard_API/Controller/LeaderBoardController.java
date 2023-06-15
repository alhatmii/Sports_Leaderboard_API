package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.LeaderBoardRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.LeaderBoardService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "LeaderBoard")
public class LeaderBoardController {
    @Autowired
    LeaderBoardService leaderBoardService;

    @RequestMapping(value = "createLeaderBoard", method = RequestMethod.POST)
    public void createLeaderBoard(@RequestParam LeaderBoardRequest leaderBoardRequest) {
        leaderBoardService.createLeaderBoard(leaderBoardRequest);
    }

    @RequestMapping(value = "getLeaderBoardById", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardById(@RequestParam Integer id) {
        LeaderBoard leaderBoardById = leaderBoardService.getLeaderBoardById(id);
        return leaderBoardById;
    }
    @RequestMapping(value = "getLeaderBoardOrderByWins", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardOrderByWins(@RequestParam Integer wins) {
        LeaderBoard leaderBoardByWins = leaderBoardService.getLeaderBoardById(wins);
        return leaderBoardByWins;
    }


}
