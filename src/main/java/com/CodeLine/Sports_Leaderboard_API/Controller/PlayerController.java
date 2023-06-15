package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Player;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.PlayerRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

// RESTful controller that handles incoming HTTP requests and produces the corresponding HTTP responses
@RestController

// Map a method or a controller class to a specific URL path and HTTP method (Postman App)
@RequestMapping(value = "Player")
public class PlayerController {

    // To Automatically Wire dependencies.
    @Autowired
    PlayerService playerService;

    // We use it to show it postman app, depending in the way of method.
    // This one used for showing player by ID
    @RequestMapping(value = "getPlayerById", method = RequestMethod.GET)

    // To request Parameter from PLayerId
    public Player getPlayerById(@RequestParam Integer id) {
        Player player = playerService.getPlayerById(id);
        return player;
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for showing player by ID
    @RequestMapping(value = "RegisterPlayer", method = RequestMethod.POST)
    public void registerPlayers(@RequestBody PlayerRequest playerRequest) {
        playerService.RegisterPlayer(playerRequest);

    }

    @RequestMapping(value = "GetAllPlayer")
    public List<Player> generateAllPlayer() {
        List<Player> playerList = playerService.getAllPlayers();
        return playerList;
    }

    @RequestMapping(value = "updatePlayer")
    public void updatePlayer() throws ParseException {
        playerService.updatePlayer();
    }
}
