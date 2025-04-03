package edu.asestatuas.golfstrokes;

public class Hole {

    private final Byte number;
    private Byte par;
    
    public Hole(Byte number, Byte par) {
        this.number = number;
        this.par = par;
    }

    public byte getPar() {
        return this.par;
    }
}
