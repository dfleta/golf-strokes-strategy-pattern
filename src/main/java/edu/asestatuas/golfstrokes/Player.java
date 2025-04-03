package edu.asestatuas.golfstrokes;

public class Player {
    
    private final String initials;
    private Byte handicap;
    private Short score = 0;
    private Short points = 0;

    public Player(String initials, Byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
    }

    public String getInitials() {
        return this.initials;
    }

    public void setScore(int score) {
        this.score = (short) score;
    }
    
    public Short getScore() {
        return this.score;
    }

    public void setPoints(int points) {
        this.points = (short) points;
    }

    public Short getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "\n" + this.initials + "\s--->" 
                + "\sH'cap:\s" + this.handicap 
                + "\tStrokes:\s" + this.getScore()
                + "\tStableford points:\s" + this.getPoints();
    }
}
