package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Team;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.TeamRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Team")
public class TeamController {
    @Autowired
    TeamService teamService;

    @RequestMapping(value = "RegisterNewTeam", method = RequestMethod.POST)
    public void registerNewTeam(@RequestBody TeamRequest teamRequest) {
        teamService.createTeam(teamRequest);
    }

    @RequestMapping( value = "getTeamById", method = RequestMethod.GET)
    public Team getTeamById(@RequestParam Integer id) {
        Team teamById = teamService.getTeamById(id);
        return teamById;
    }
}

