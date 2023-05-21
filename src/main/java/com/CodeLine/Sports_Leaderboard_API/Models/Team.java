package com.CodeLine.Sports_Leaderboard_API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Data

public class Team extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;
    private String sport;

    public Team() {
        // Default constructor required by JPA
    }

    public Team(String teamName, String sport) {
        this.teamName = teamName;
        this.sport = sport;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @JoinColumn(name = "player_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    Player Player;

    @JoinColumn(name = "player_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    List<Player> team;

    @OneToMany(mappedBy = "team1")
    private List<Game> gamesAsTeam1;

    @OneToMany(mappedBy = "team2")
    private List<Game> gamesAsTeam2;
    
    public List<Game> getGamesAsTeam1() {
        return gamesAsTeam1;
    }

    public void setGamesAsTeam1(List<Game> gamesAsTeam1) {
        this.gamesAsTeam1 = gamesAsTeam1;
    }

    public List<Game> getGamesAsTeam2() {
        return gamesAsTeam2;
    }

    public void setGamesAsTeam2(List<Game> gamesAsTeam2) {
        this.gamesAsTeam2 = gamesAsTeam2;
    }


}
