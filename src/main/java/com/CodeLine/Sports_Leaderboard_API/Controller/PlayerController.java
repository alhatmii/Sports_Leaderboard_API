package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Player;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.PlayerRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "Player")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "getPlayerById", method = RequestMethod.GET)
    public Player getPlayerById(@RequestParam Integer id) {
        Player player = playerService.getPlayerById(id);
        return player;
    }

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
