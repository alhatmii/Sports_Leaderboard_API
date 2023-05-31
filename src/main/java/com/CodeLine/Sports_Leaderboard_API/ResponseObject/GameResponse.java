package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import com.CodeLine.Sports_Leaderboard_API.RequestObject.TeamRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class GameRequest {
    Integer gameId;
    String gameDescription;
    TeamRequest teamRequest1;
    TeamRequest teamRequest2;
    Integer scoreTeam1;
    Integer scoreTeam2;
  
}