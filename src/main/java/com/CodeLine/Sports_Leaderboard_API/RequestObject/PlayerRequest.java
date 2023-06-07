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


}
