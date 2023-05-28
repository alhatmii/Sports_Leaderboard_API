package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Game")

public class
GameController {
    @Autowired
    GameService gameService;

    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public void createGame() {
        gameService.createGame();
    }
}
