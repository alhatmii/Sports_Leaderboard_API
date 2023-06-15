package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.Team;
import com.CodeLine.Sports_Leaderboard_API.Repository.RegistrationRepository;
import com.CodeLine.Sports_Leaderboard_API.Repository.TeamRepository;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.TeamRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

// Used to mark the Class as Service Component, To write the all methods required from the class to perform
// responsible for processing and coordinating business logic
@Service
public class TeamService {

    // To Automatically Wire dependencies.
    @Autowired
    RegistrationRepository registrationRepository;

    // To Automatically Wire dependencies.
    @Autowired
    TeamRepository teamRepository;

    // Method to add players manually from HTTP (Postman App)
    public void createTeam(TeamRequest teamRequest){
        Team newTeam = new Team();
        newTeam.setLosses(teamRequest.getLosses());
        newTeam.setWins(teamRequest.getWins());
        newTeam.setCreatedDate(new Date());
        newTeam.setIsActive(true);
        newTeam.setRegistration(registrationRepository.getRegistrationId(1));
        teamRepository.save(newTeam);

    }

    // Method to show Teams by ID that were stored in the Database
    public Team getTeamById(Integer id){
        Team teamById = teamRepository.getTeamById(id);
        return teamById;

    }
}