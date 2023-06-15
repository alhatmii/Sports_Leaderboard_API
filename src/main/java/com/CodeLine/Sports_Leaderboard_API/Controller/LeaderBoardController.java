package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.LeaderBoardRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.LeaderBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// RESTful controller that handles incoming HTTP requests and produces the corresponding HTTP responses
@RestController

// Map a method or a controller class to a specific URL path and HTTP method (Postman App)
@RequestMapping(value = "LeaderBoard")
public class LeaderBoardController {

    // To Automatically Wire dependencies.
    @Autowired
    LeaderBoardService leaderBoardService;

    // We use it to show it postman app, depending in the way of method.
    // This one used for Creating match ScoreLeaderBoard
    @RequestMapping(value = "createLeaderBoard", method = RequestMethod.POST)
    public void createLeaderBoard(@RequestParam LeaderBoardRequest leaderBoardRequest) {
        leaderBoardService.createLeaderBoard(leaderBoardRequest);
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for Showing match Game score by ID
    @RequestMapping(value = "getLeaderBoardById", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardById(@RequestParam Integer id) {
        LeaderBoard leaderBoardById = leaderBoardService.getLeaderBoardById(id);
        return leaderBoardById;
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for Showing match Game score by LeaderBoardWins
    @RequestMapping(value = "getLeaderBoardOrderByWins", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardOrderByWins(@RequestParam Integer wins) {
        LeaderBoard leaderBoardByWins = leaderBoardService.getLeaderBoardById(wins);
        return leaderBoardByWins;
    }

}
