package com.CodeLine.Sports_Leaderboard_API.Service;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import com.CodeLine.Sports_Leaderboard_API.Repository.RegistrationRepository;
import com.CodeLine.Sports_Leaderboard_API.RequestObject.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

// Used to mark the Class as Service Component, To write the all methods required from the class to perform
// responsible for processing and coordinating business logic
@Service
public class RegistrationService {

    // To Automatically Wire dependencies.
    @Autowired

    RegistrationRepository registrationRepository;

//     Method to add players manually to Intellij
//        public void RegisterTeam() {
//        Registration register = new Registration();
//        register.setTeamName("ALhatmi");
//        register.setPassword("12355554");
//        register.setSportType("football");
//        register.setCreatedDate(new Date());
//        register.setIsActive(true);
//        registrationRepository.save(register);
//    }

    // Method to add players manually from HTTP (Postman App)
    public void RegisterTeam(RegistrationRequest registrationRequest) {
        Registration register = new Registration();
        register.setTeamName(registrationRequest.getUserName());
        register.setTeamName(registrationRequest.getTeamName());
        register.setPassword(registrationRequest.getPassword());
        register.setSportType(registrationRequest.getSportType());
        register.setCreatedDate(new Date());
        register.setIsActive(true);
        //registrationRepository.save(register);
    }

    // Method to show all Players by ID that were stored in the Database
    public Registration getRegistrationById(Integer id){
        Registration registerById = registrationRepository.getRegistrationId(id);
        return registerById;

    }

}
