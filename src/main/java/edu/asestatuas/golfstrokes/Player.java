package edu.asestatuas.golfstrokes;

public class Player {
    
    private final String initials;
    private Byte handicap;
    private Short score = 0;
    private Byte[] course;

    public Player(String initials, Byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
    }

    public void setCourse(Byte[] course) {
        this.course = course;
    }

    public Byte[] getCourse() {
        return this.course;
    }

    public String getInitials() {
        return this.initials;
    }
}
