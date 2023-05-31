package com.CodeLine.Sports_Leaderboard_API.RequestObject;

import com.CodeLine.Sports_Leaderboard_API.Models.Game;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class GameRequest {
    @Data
    @Getter
    @Setter
    public class GameRequest {
        Integer gameId;
        String gameInformation;
        TeamRequest teamRequest1;
        TeamRequest teamRequest2;
        Integer scoreTeam1;
        Integer scoreTeam2;
        public static Game convertToGameRequest (GameRequest request){
            Game game = new Game();
            game.setGameInformation(request.getGameInformation());
            game.setTeam1(TeamRequest.convertToTeamRequest(request.getTeamRequest1()));
            game.setTeam2(TeamRequest.convertToTeamRequest(request.getTeamRequest2()));
            game.setScoreTeam1(request.getScoreTeam1());
            game.setScoreTeam2(request.getScoreTeam2());
            return game;

        }
        public static List<Game> convertListToGameRequest(List<GameRequest> gameRequestList){
            List<Game> gameList = new ArrayList<>();
            if (!gameRequestList.isEmpty()) {
                for (GameRequest gameRequest : gameRequestList) {
                    gameList.add(convertToGameRequest(gameRequest));
                }
            }
            return gameList;

        }
    }
}
