package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PlayerResponse {
    Integer Id;
    String Name;
    String tName;
    String sport;
}
