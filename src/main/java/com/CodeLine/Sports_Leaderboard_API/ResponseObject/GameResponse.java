package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import com.CodeLine.Sports_Leaderboard_API.RequestObject.TeamRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class GameResponse {
    Integer Id;
    String Description;
    TeamRequest tRequest1;
    TeamRequest tRequest2;
    Integer score1;
    Integer score2;

}