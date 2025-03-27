package edu.asestatuas.golfstrokes;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    List<Hole> holes;
    

    public ScoreCard(byte numHoles) {
        this.holes = new ArrayList<Hole>(numHoles);
    }
    

}
