package com.artisan.designpattern.state.game.state;

public class ThirdLevel extends GameState {
    public ThirdLevel(GamePlay gamePlay) {
        super(gamePlay);
    }

    @Override
    public void addPoints(int points) {
        gamePlay.setTotalPoints(gamePlay.getTotalPoints() + 3 * points);
    }

    @Override
    public String getGameLevel() {
        return "Third Level";
    }
}
