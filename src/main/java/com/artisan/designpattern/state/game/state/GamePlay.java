package com.artisan.designpattern.state.game.state;

import java.util.Random;

public class GamePlay {
    private int totalPoints;
    private GameState gameState;
    public GamePlay() {
        Random random = new Random();
        this.totalPoints = random.nextInt(7);
    }
    public void addPoints(int points) {
        gameState.addPoints(points);
    }
    public String getGameLevel()
    {
       return gameState.getGameLevel();
    }
    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }


    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}