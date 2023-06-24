package com.artisan.designpattern.state.game.state;

public abstract class GameState {
    protected final GamePlay gamePlay;
    public GameState(GamePlay gamePlay) {
        this.gamePlay = gamePlay;
    }
    public abstract void addPoints(int points);
    public abstract String getGameLevel();
}
