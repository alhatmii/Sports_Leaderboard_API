package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import com.CodeLine.Sports_Leaderboard_API.Repository.GameRepository;
import com.CodeLine.Sports_Leaderboard_API.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    GameRepository gameRepository;
    public void createGame(){
        Game gameToCreate = new Game();
//        gameToCreate.setgameInformation("This game can play with 2 teams");
//        gameToCreate.setScoreTeam1(1);
//        gameToCreate.setScoreTeam2(2);
//        gameToCreate.setTeam1(teamRepository.getTeamById(1));
//        gameToCreate.setTeam2(teamRepository.getTeamById(2));
//        gameToCreate.setCreateDate(new Date());
//        gameToCreate.setIsActive(true);
//        gameRepository.save(gameToCreate);

}
