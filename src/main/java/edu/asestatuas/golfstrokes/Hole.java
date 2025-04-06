package edu.asestatuas.golfstrokes;

class Hole {

    private final Byte number;
    private final Byte par;
    
    Hole(Byte number, Byte par) {
        this.number = number;
        this.par = par;
    }

    byte getPar() {
        return this.par;
    }

    @Override
    public String toString() {
        return "\s\s\s" + this.number + " - " + String.valueOf(this.getPar());
    }
}
