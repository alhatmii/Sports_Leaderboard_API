package com.CodeLine.Sports_Leaderboard_API.Repository;

import com.CodeLine.Sports_Leaderboard_API.Models.Registration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository {
    @Query(value = "select r from Registration r where r.id= :id")
    Registration getRegistrationId(@Param("id") Integer id);
}
