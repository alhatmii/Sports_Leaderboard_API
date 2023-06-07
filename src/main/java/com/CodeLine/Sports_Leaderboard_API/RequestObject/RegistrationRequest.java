package com.CodeLine.Sports_Leaderboard_API.RequestObject;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter

public class RegistrationRequest {
    Integer registerId;
    String userName;
    String password;
    String teamName;
    String sportType;


}
