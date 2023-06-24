package com.artisan.designpattern.state.game.state;

public class Level2_5 extends GameState {
    public Level2_5(GamePlay gamePlay) {
        super(gamePlay);
    }

    @Override
    public void addPoints(int points) {
        gamePlay.setTotalPoints(gamePlay.getTotalPoints()+1);
        checkForUpgrade();
    }

    @Override
    public String getGameLevel() {
        return "Level 2_5 ";
    }
    public void checkForUpgrade() {
        if(gamePlay.getTotalPoints() >= 20) {
            ThirdLevel thirdLevel = new ThirdLevel(gamePlay);
            gamePlay.setGameState(thirdLevel);
            gamePlay.setTotalPoints(gamePlay.getTotalPoints() +1);
        }
    }
}
