package edu.asestatuas.golfstrokes;

import com.google.common.collect.Streams;
import com.google.common.primitives.Bytes;

public class Stableford implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        scoreCard.getPlayers().forEach(
            player -> player.setPoints(
                Streams.zip(scoreCard.getHoles().stream().map(Hole::getPar), 
                            Bytes.asList(scoreCard.getPlayerCourse(player)).stream(),
                            (par, strokes) -> strokes - par)
                        .map(StablefordSystem::getLevel)
                        .map(StablefordSystem::getPoints)
                        .reduce(0, Integer::sum)));
    }
}
