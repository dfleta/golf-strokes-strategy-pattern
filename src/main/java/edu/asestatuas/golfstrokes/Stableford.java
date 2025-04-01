package edu.asestatuas.golfstrokes;

public class Stableford implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        throw new UnsupportedOperationException("Unimplemented method 'scoring'");
        // restar strokes - par = numero bajo /sobre par; 3 - 5 = -2 bajo par
        // enum.PAR(2) - numero = enum  ;  2 --2 = 4 => enum.val(4).getPints()
         
    }
}
