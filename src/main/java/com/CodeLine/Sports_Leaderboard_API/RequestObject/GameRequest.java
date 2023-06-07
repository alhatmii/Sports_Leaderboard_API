package com.CodeLine.Sports_Leaderboard_API.RequestObject;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

    @Data
    @Getter
    @Setter
    public class GameRequest {
        Integer gameId;
        String gameInformation;
        TeamRequest teamRequest1;
        TeamRequest teamRequest2;
        Integer scoreTeamA;
        Integer scoreTeamB;

        public static Game convertToGameRequest(GameRequest request) {
            Game game = new Game();
            game.setGameInformation(request.getGameInformation());
            game.setTeamNumber1(TeamRequest.convertToTeamRequest(request.getTeamRequest1()));
            game.setTeamNumber2(TeamRequest.convertToTeamRequest(request.getTeamRequest2()));
            game.setScoreTeamA(request.getScoreTeamA());
            game.setScoreTeamB(request.getScoreTeamB());
            return game;

        }

        public static List<Game> convertListToGameRequest(List<GameRequest> gameRequestList) {
            List<Game> gameList = new ArrayList<>();
            if (!gameRequestList.isEmpty()) {
                for (GameRequest gameRequest : gameRequestList) {
                    gameList.add(convertToGameRequest(gameRequest));
                }
            }
            return gameList;

        }
    }


