package edu.asestatuas.golfstrokes;

public class Hole {

    private final Byte number;
    private Byte par;
    private Byte handicap;
    
    public Hole(Byte number, Byte par, Byte handicap) {
        this.number = number;
        this.par = par;
        this.handicap = handicap;
    }
    
}
