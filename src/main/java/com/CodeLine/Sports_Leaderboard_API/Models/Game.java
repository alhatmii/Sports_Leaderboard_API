package com.CodeLine.Sports_Leaderboard_API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

// To auto generate Getter & Setter for Properties
@Getter
@Setter

// Meaning to Add tables in Data Base
@Entity

// Makes it easier to work with your Java classes by generating helpful methods automatically (toString, equals, hashCode)
@Data

public class Game extends BaseEntity {

    // To Indicate primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // To add a column in DATABASE
    @Column(name = "id")
    Integer gameId;
    String gameInformation;

    // To add a relationship between two tables (team1_id & id)
    @OneToOne
    
    // annotation is used to specify the mapping between two entities in a relational database.
    @JoinColumn(name = "team1_id",referencedColumnName = "id")
    Team teamNumber1;

    // To add a relationship between two tables (team1_id & id)
    @OneToOne

    // annotation is used to specify the mapping between two entities in a relational database.
    @JoinColumn(name = "team2_id",referencedColumnName = "id")
    Team teamNumber2;
    Integer scoreTeamA;
    Integer scoreTeamB;

}
