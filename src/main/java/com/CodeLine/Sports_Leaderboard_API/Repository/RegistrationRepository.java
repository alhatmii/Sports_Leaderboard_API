package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// To indicate that the Class is repository component
@Repository
public interface RegistrationRepository {

    // To write the Query for SQL database
    // To show Registration IDs by ID as parameter
    @Query(value = "select r from Registration r where r.id= :id")
    Registration getRegistrationId(@Param("id") Integer id);
}
