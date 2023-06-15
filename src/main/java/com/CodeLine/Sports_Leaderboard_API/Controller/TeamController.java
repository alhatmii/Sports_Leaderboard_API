package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Team;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.TeamRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// RESTful controller that handles incoming HTTP requests and produces the corresponding HTTP responses=
@RestController

// Map a method or a controller class to a specific URL path and HTTP method (Postman App)
@RequestMapping(value = "Team")
public class TeamController {

    // To Automatically Wire dependencies.
    @Autowired
    TeamService teamService;

    // We use it to show it postman app, depending in the way of method.
    // This one used for showing Registeration of new Teams
    @RequestMapping(value = "RegisterNewTeam", method = RequestMethod.POST)
    public void registerNewTeam(@RequestBody TeamRequest teamRequest) {
        teamService.createTeam(teamRequest);
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for showing RegisterationID for the teams
    @RequestMapping( value = "getTeamById", method = RequestMethod.GET)
    public Team getTeamById(@RequestParam Integer id) {
        Team teamById = teamService.getTeamById(id);
        return teamById;
    }
}

