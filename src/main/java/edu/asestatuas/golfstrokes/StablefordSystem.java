package edu.asestatuas.golfstrokes;

import java.util.Arrays;
import java.util.Optional;

enum StablefordSystem {

    /** Two strokes or more over par */
    DOUBLE_BOGEY(2, -3),
    
    /** One stroke over par */
    BOGEY(1, -1),
    
    /** Equal to par */
    PAR(0, 0),
    
    /** One stroke under par */
    BIRDIE(-1, 2),
    
    /** Two strokes under par */
    EAGLE(-2, 5),
    
    /** Three strokes under par */
    ALBATROSS(-3, 8);

    private final int strokes;
    private final int points;

    private StablefordSystem(int strokes, int points) {
        this.strokes = strokes;
        this.points = points;
    }

    int getPoints() {
        return this.points;
    }

    int getStrokes() {
        return this.strokes;
    }

    static StablefordSystem getLevel(int strokes) {
        Optional<StablefordSystem> level = Arrays.asList(StablefordSystem.values())
                                                    .stream()
                                                    .filter(l -> l.getStrokes() == strokes)
                                                    .findFirst();
        return level.isPresent()? level.get() : DOUBLE_BOGEY;
    }

    @Override
    public String toString() {
        return this.name() + ":\s" + this.getPoints();
    }
}
