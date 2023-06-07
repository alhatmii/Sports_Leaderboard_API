package com.CodeLine.Sports_Leaderboard_API.RequestObject;


import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter

public class LeaderBoardRequest {
    Integer leaderBoardId;
    String teamName;
    Integer wins;
    Integer losses;

}
