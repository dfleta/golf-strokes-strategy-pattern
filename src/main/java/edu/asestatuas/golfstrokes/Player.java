package edu.asestatuas.golfstrokes;

public class Player {
    
    private final String initials;
    private Byte handicap;
    private Short score = 0;

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

    @Override
    public String toString() {
        return this.initials + "\sH'cap:\s" + this.handicap + "\sstrokes:\s" + this.getScore();
    }
}
