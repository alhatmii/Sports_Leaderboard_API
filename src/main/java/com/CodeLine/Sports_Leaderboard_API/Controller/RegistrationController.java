package com.CodeLine.Sports_Leaderboard_API.Controller;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.RegistrationRequest;
import com.CodeLine.Sports_Leaderboard_API.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// RESTful controller that handles incoming HTTP requests and produces the corresponding HTTP responses
@RestController

// Map a method or a controller class to a specific URL path and HTTP method (Postman App)
@RequestMapping (value = "Registration")
public class RegistrationController {

    // To Automatically Wire dependencies.
    @Autowired
    RegistrationService registrationService;

    // We use it to show it postman app, depending in the way of method.
    // This one used for showing RegisteredTeam
    @RequestMapping(value = "RegisterTeam", method = RequestMethod.POST)
    public void registerTeam(@RequestBody RegistrationRequest registrationRequest) {
        registrationService.RegisterTeam(registrationRequest);
    }

    // We use it to show it postman app, depending in the way of method.
    // This one used for showing Registeration by ID
    @RequestMapping( value = "getRegisterById", method = RequestMethod.GET)
    public Registration getRegistrationById(@RequestParam Integer id) {
        Registration registerById = registrationService.getRegistrationById(id);
        return registerById;
    }
}
