package edu.asestatuas.golfstrokes;

public class ComputeCard {
    
    private ScoreCard scoreCard;
    private GolfPlay strategy;

    public ComputeCard (ScoreCard scoreCard, GolfPlay strategy) {
        this.scoreCard = scoreCard;
        this.strategy = strategy;
    }

    public void compute() {
        // guardar en strokes de cada jugador
        // en la tarjeta el total de cada jugador
        this.strategy.scoring(this.scoreCard);
    }
}
