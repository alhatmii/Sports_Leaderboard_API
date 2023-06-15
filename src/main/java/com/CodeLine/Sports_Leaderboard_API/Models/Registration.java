package com.CodeLine.Sports_Leaderboard_API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// To auto generate Getter & Setter for Properties
@Setter
@Getter

// Meaning to Add tables in Data Base
@Entity

// Makes it easier to work with your Java classes by generating helpful methods automatically (toString, equals, hashCode)
@Data

public class Registration extends BaseEntity{

    // To Indicate primary key
    @Id

    // To specify the strategy of generating IDs (Identity: auto-incrementing column in the database to generate unique identifier values)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // annotation is used to specify the mapping between two entities in a relational database.
    @Column(name = "id")
    Integer registerId;
    String userName;
    String password;
    String teamName;
    String sportType;
}