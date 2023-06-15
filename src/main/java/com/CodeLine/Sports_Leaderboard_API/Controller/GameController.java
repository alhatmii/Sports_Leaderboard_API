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

// RESTful controller that handles incoming HTTP requests and produces the corresponding HTTP responses
@RestController

// Map a method or a controller class to a specific URL path and HTTP method (Postman App)
@RequestMapping(value = "Game")

public class
GameController {

    // To Automatically Wire dependencies.
    @Autowired
    GameService gameService;

    // We use it to show it postman app, depending in the way of method.
    // This one used for Creating match Game
    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public String createGame() {

        // To throw an Exception to the method
        try {
            gameService.createGame();
            return "Game is created successfully";
        } catch (Exception e){
            return "Sorry the creation of the game is failed";
        }
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for Showing match Game by ID
    @RequestMapping(value = "getGameById", method = RequestMethod.GET)
    public Game getGameById(@RequestParam Integer id) {
        Game gameById = gameService.getGameById(id);
        return gameById;
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for Showing all match Game
    @RequestMapping(value = "getAllGame", method = RequestMethod.GET)
    public List<Game> getAllGame(){
        List<Game> listOfAllGames =gameService.getAllGame();
        return listOfAllGames;
    }
}
