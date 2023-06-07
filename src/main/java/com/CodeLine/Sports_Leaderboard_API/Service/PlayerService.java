package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.Player;
import com.CodeLine.Sports_Leaderboard_API.Repository.PlayerRepository;
import com.CodeLine.Sports_Leaderboard_API.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    TeamRepository teamRepository;

    public void RegisterPlayer() {
        Player player = new Player();
        player.setTeamName("OTO");
        player.setPlayerName("mohammed");
        player.setSport("Basketball");
        player.setCreatedDate(new Date());
        player.setUpdatedDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);


    }


    public List<Player> getAllPlayers() {

        return playerRepository.getAllPlayer();
    }


    public void updatePlayer() {

        Player player = new Player();
        player.setPlayerId(1);
        player.setTeamName("All for one");
        player.setSport("football");
        player.setCreatedDate(new Date());
        player.setUpdatedDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);

    }

    public Player getPlayerById(Integer id) {
        Player player = playerRepository.getPlayerId(id);
        return player;

    }

}