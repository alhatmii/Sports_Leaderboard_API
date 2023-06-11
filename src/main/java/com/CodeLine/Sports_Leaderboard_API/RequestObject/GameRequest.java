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


}


