package com.artisan.designpattern.state.game.state;

public class SecondLevel extends GameState {
    public SecondLevel(GamePlay gamePlay) {
        super(gamePlay);
    }

    @Override
    public void addPoints(int points) {
        gamePlay.setTotalPoints(gamePlay.getTotalPoints() + 2* points);
        checkForUpgrade2();
        //checkForUpgrade();
    }

    @Override
    public String getGameLevel() {
        return "Second Level";
    }
/*
    // transfer to third level
    public void checkForUpgrade() {
        if(gamePlay.getTotalPoints() > 20) {
            ThirdLevel thirdLevel = new ThirdLevel(gamePlay);
            gamePlay.setGameState(thirdLevel);
            gamePlay.setTotalPoints(gamePlay.getTotalPoints() +2);
        }
    }

 */

    public void checkForUpgrade2() {
        if(gamePlay.getTotalPoints() >= 15) {
            Level2_5 level2_5 = new Level2_5(gamePlay);
            gamePlay.setGameState(level2_5);
            gamePlay.setTotalPoints(gamePlay.getTotalPoints() +1);
        }
    }
}
