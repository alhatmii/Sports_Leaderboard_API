package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Registration")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "RegisterTeam", method = RequestMethod.POST)                 //Register Player
    public void registerTeam() {
        registrationService.RegisterTeam();
    }
}
