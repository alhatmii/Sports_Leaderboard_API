package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Makes it easier to work with your Java classes by generating helpful methods automatically (toString, equals, hashCode)
@Data

// To auto generate Getter & Setter for Properties
@Getter
@Setter

public class PlayerResponse {
    Integer Id;
    String Name;
    String tName;
    String sport;
}
