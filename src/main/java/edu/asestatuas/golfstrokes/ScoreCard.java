package edu.asestatuas.golfstrokes;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private final Byte NUM_HOLES = 18;
    
    private Player playerA;
    private Player playerB;
    private Player playerC;
    private Player playerD;
    
    private final List<Hole> holes = new ArrayList<Hole>();
    
    private Course playersCourse;

    public ScoreCard() {};
    
    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public void setPlayerC(Player playerC) {
        this.playerC = playerC;
    }

    public void setPlayerD(Player playerD) {
        this.playerD = playerD;
    }

    public void setPlayersCourse(Course playersCourse) {
        this.playersCourse = playersCourse;
    }
    
}
