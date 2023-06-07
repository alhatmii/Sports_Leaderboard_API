package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import com.CodeLine.Sports_Leaderboard_API.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "Registration")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "RegisterTeam", method = RequestMethod.POST)
    public void registerTeam() {
        registrationService.RegisterTeam();
    }
    @RequestMapping( value = "getRegisterById", method = RequestMethod.GET)
    public Registration getRegistrationById(@RequestParam Integer id) {
        Registration registerById = registrationService.getRegistrationById(id);
        return registerById;
    }
}
