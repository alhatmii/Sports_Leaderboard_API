package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.Player;
import com.CodeLine.Sports_Leaderboard_API.Repository.PlayerRepository;
import com.CodeLine.Sports_Leaderboard_API.Repository.TeamRepository;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.PlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

// Used to mark the Class as Service Component, To write the all methods required from the class to perform
// responsible for processing and coordinating business logic
@Service
public class PlayerService {

    // To Automatically Wire dependencies.
    @Autowired
    PlayerRepository playerRepository;

    // To Automatically Wire dependencies.
    @Autowired
    TeamRepository teamRepository;

    // Method to add players manually to Intellij
//    public void RegisterPlayer() {
//        Player player = new Player();
//        player.setTeamName("ooo");
//        player.setPlayerName("mohammed");
//        player.setSport("Basketball");
//        player.setCreatedDate(new Date());
//        player.setUpdatedDate(new Date());
//        player.setIsActive(Boolean.TRUE);
//        playerRepository.save(player);
//
//
//    }

    // Method to add players manually from HTTP (Postman App)
    public void RegisterPlayer(PlayerRequest playerRequest) {
    Player player = new Player();
    player.setTeamName(playerRequest.getTeamName());
    player.setPlayerName(playerRequest.getPlayerName());
    player.setSport(playerRequest.getSport());
    player.setCreatedDate(new Date());
    player.setUpdatedDate(new Date());
    player.setIsActive(Boolean.TRUE);
    playerRepository.save(player);
}

    // Method to show all Players that were stored in the Database
    public List<Player> getAllPlayers() {
        return playerRepository.getAllPlayer();
    }

    // Method to Update particular Players that were stored in the Database
    public void updatePlayer() {
        Player player = new Player();
        player.setPlayerId(1);
        player.setTeamName("hwh1");
        player.setSport("football");
        player.setCreatedDate(new Date());
        player.setUpdatedDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);

    }

    // Method to show all Players by ID that were stored in the Database
    public Player getPlayerById(Integer id) {
        Player player = playerRepository.getPlayerId(id);
        return player;

    }

}