package com.CodeLine.Sports_Leaderboard_API.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TeamRequest {
    Integer teamId;
    Integer wins;
    Integer losses;
    RegistrationRequest registrationRequest;
    public static Team convertToTeamRequest (TeamRequest request){
        Team team = new Team();
        team.setWins(request.getWins());
        team.setLosses(request.getLosses());
        team.setRegistration(RegistrationRequest.convertToRegistrationRequest(request.getRegistrationRequest()));
        return team;
    }
    public static List<Team> convertListToTeamRequest(List<TeamRequest> TeamRequestList) {
        List<Team> TeamList = new ArrayList<>();
        if (!TeamRequestList.isEmpty()) {
            for (TeamRequest teamRequest : TeamRequestList) {
                TeamList.add(convertToTeamRequest(teamRequest));
            }
        }
        return TeamList;

    }
}
