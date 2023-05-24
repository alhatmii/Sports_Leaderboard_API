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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer gameId;
    String gameInformation;
    @OneToOne
    @JoinColumn(name = "team1_id",referencedColumnName = "id")
    Team teamNumber1;
    @OneToOne
    @JoinColumn(name = "team2_id",referencedColumnName = "id")
    Team teamNumber2;
    Integer scoreTeamA;
    Integer scoreTeamB;

}
