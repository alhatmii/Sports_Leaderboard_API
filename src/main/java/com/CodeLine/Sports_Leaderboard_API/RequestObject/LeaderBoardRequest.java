package com.CodeLine.Sports_Leaderboard_API.RequestObject;


import com.CodeLine.Sports_Leaderboard_API.Models.LeaderBoard;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter

public class LeaderBoardRequest {
    Integer leaderBoardId;
    String teamName;
    Integer wins;
    Integer losses;

}
