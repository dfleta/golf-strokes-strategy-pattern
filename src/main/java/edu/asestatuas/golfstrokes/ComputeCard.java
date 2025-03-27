package edu.asestatuas.golfstrokes;

public class ComputeCard {
    
    private ScoreCard scoreCard;
    private GolfPlay strategy;

    public ComputeCard (ScoreCard scoreCard, GolfPlay strategy) {
        this.scoreCard = scoreCard;
        this.strategy = strategy;
    }

    public short compute() {
        // guardar en total de la tarjeta el total de cada jugador
        return this.strategy.scoring(this.scoreCard);
    }
}
