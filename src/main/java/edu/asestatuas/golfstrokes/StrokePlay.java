package edu.asestatuas.golfstrokes;

import com.google.common.primitives.Bytes;

public class StrokePlay implements GolfPlay {
    
    @Override
    public void scoring(ScoreCard scoreCard) {
        scoreCard.getPlayers().forEach(player -> 
            player.setScore(
                Bytes.asList(scoreCard.getPlayerCourse(player))
                    .stream()
                    .map(Byte::intValue)
                    .reduce(0, Integer::sum)
            )
        );
    }
}
