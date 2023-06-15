package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import com.CodeLine.Sports_Leaderboard_API.ResponseObject.GameResponse;
import com.CodeLine.Sports_Leaderboard_API.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Game")

public class
GameController {
    @Autowired
    GameService gameService;

    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public String createGame() {
        try {
            gameService.createGame();
            return "Game is created successfully";
        } catch (Exception e){
            return "Sorry the creation of the game is failed";
        }
    }

    @RequestMapping(value = "getGameById", method = RequestMethod.GET)
    public Game getGameById(@RequestParam Integer id) {
        Game gameById = gameService.getGameById(id);
        return gameById;
    }
    @RequestMapping(value = "getAllGame", method = RequestMethod.GET)
    public List<Game> getAllGame(){
        List<Game> listOfAllGames =gameService.getAllGame();
        return listOfAllGames;
    }
}
