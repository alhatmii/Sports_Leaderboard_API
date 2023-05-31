package com.CodeLine.Sports_Leaderboard_API.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class RegistrationRequest {
    Integer registerId;
    String userName;
    String password;
    String teamName;
    String sportType;

    public static Registration convertToRegistrationRequest(RegistrationRequest request) {
        Registration registration = new Registration();
        registration.setUserName(request.getUserName());
        registration.setPassword(request.getPassword());
        registration.setTeamName(request.getTeamName());
        registration.setSportType(request.getSportType());
        registration.setCreateDate(new Date());
        registration.setIsActive(true);
        return registration;

    }

    public static List<Registration> convertListToRegistrationRequest(List<RegistrationRequest> RegistrationRequestList) {
        List<Registration> RegistrationList = new ArrayList<>();
        if (!RegistrationRequestList.isEmpty()) {
            for (RegistrationRequest registrationRequest : RegistrationRequestList) {
                RegistrationList.add(convertToRegistrationRequest(registrationRequest));
            }
        }
        return RegistrationList;

    }
}
