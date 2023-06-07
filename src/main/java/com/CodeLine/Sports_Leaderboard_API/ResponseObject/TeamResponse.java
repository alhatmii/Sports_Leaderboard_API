package com.CodeLine.Sports_Leaderboard_API.ResponseObject;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TeamResponse {
    Integer Id;
    Integer wins;
    Integer losses;
    Registration registration;
}