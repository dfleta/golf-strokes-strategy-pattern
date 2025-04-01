package edu.asestatuas.golfstrokes;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private final Byte NUM_HOLES = 18;
    
    private Player playerA; // optional
    private Player playerB;
    private Player playerC;
    private Player playerD;
    
    private final List<Hole> holes = new ArrayList<Hole>();
    
    private Course playersCourse;

    public ScoreCard() {};
    
    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
        // set optional
    }

    public Player getPlayerA() {
        return this.playerA;
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

    public byte[] getPlayerCourse(Player player) {
        return this.playersCourse.getPlayerCourse(player);
    }
    
    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        if (playerA != null) players.add(playerA);
        if (playerB != null) players.add(playerB);
        if (playerC != null) players.add(playerC);
        if (playerD != null) players.add(playerD);
        return players;
    }
}
