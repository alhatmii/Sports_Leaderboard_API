package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RegistrationResponse {
    Integer Id;
    String user;
    String password;
    String tName;
    String sportType;
}