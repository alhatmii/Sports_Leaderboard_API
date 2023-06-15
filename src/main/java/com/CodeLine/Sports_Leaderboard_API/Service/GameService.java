package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import com.CodeLine.Sports_Leaderboard_API.Repository.GameRepository;
import com.CodeLine.Sports_Leaderboard_API.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

// Used to mark the Class as Service Component, To write the all methods required from the class to perform
// responsible for processing and coordinating business logic
@Service
public class GameService {

    // To Automatically Wire dependencies.
    @Autowired
    TeamRepository teamRepository;

    // To Automatically Wire dependencies.
    @Autowired
    GameRepository gameRepository;


    // Method to create a match Game and store it in the Database
    public void createGame() {
        Game gameToCreate = new Game();
        gameToCreate.setGameInformation("This game can play with 2 teams");
        gameToCreate.setScoreTeamA(1);
        gameToCreate.setScoreTeamB(2);
        gameToCreate.setTeamNumber1(teamRepository.getById(1));
        gameToCreate.setTeamNumber2(teamRepository.getById(2));
        gameToCreate.setCreatedDate(new Date());
        gameToCreate.setIsActive(true);
        gameRepository.save(gameToCreate);

    }

    // Method to show all match Games that stored  in the Database
    public Game getGameById(Integer id){
        Game gameById = gameRepository.getGameById(id);
        return gameById;

    }
    public List<Game> getAllGame(){
        return  gameRepository.getAllGame();
    }
}
