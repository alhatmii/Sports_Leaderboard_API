package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import com.CodeLine.Sports_Leaderboard_API.RequestObject.TeamRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Makes it easier to work with your Java classes by generating helpful methods automatically (toString, equals, hashCode)
@Data

// To auto generate Getter & Setter for Properties
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