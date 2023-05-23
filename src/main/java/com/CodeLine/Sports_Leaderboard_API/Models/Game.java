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

public class Game extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//     Team team1;
//
//    @ManyToOne
//     Team team2;
//
//    Integer score1;
//    Integer score2;
//
//    public Game() {
//        // Default constructor required by JPA
//    }
//
//    public Game(Team team1, Team team2, Integer score1, Integer score2) {
//        this.team1 = team1;
//        this.team2 = team2;
//        this.score1 = score1;
//        this.score2 = score2;
//    }
//
//    // Getters and Setters
//
////    public Long getId() {
////        return id;
////    }
////
////    public void setId(Long id) {
////        this.id = id;
////    }
////
////    public Team getTeam1() {
////        return team1;
////    }
////
////    public void setTeam1(Team team1) {
////        this.team1 = team1;
////    }
////
////    public Team getTeam2() {
////        return team2;
////    }
////
////    public void setTeam2(Team team2) {
////        this.team2 = team2;
////    }
////
////    public int getScore1() {
////        return score1;
////    }
////
////    public void setScore1(int score1) {
////        this.score1 = score1;
////    }
////
////    public int getScore2() {
////        return score2;
////    }
//
//    public void setScore2(Integer score2) {
//        this.score2 = score2;
//    }
//    @JoinColumn(name = "Team_id", referencedColumnName = "Match_id")
//    @OneToOne(cascade = CascadeType.ALL)
//    Team Team;
//    @OneToMany
//    @JoinColumn(name = "Team_id", referencedColumnName = "Match_id")
//   //(cascade = CascadeType.ALL)
//    List<Team> team;

}
