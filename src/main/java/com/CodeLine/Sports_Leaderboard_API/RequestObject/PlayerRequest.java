package com.CodeLine.Sports_Leaderboard_API.RequestObject;

import com.CodeLine.Sports_Leaderboard_API.Models.Player;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Data
@Getter
@Setter
public class PlayerRequest {
    Integer playerId;
    String playerName;
    String teamName;
    String sport;

    public static Player covertPlayerToRequest(PlayerRequest request) {
        Player player = new Player();
        player.setPlayerName(request.getPlayerName());
        player.setTeamName(request.getTeamName());
        player.setSport(request.getSport());
        return player;
    }

    public static List<Player> convertListToPlayerRequest(List<PlayerRequest> PlayerRequestList) {
        List<Player> playerList = new ArrayList<>();
        if (!PlayerRequestList.isEmpty()) {
            for (PlayerRequest playerRequest : PlayerRequestList) {
                playerList.add(covertPlayerToRequest(playerRequest));
            }
        }
        return playerList;

    }
}
