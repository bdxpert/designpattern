package com.artisan.designpattern.state.game.state;

public class FirstLevel extends GameState {
    public FirstLevel(GamePlay gamePlay) {
        super(gamePlay);
    }

    @Override
    public void addPoints(int points) {
        gamePlay.setTotalPoints(gamePlay.getTotalPoints()+points);
        checkForUpgrade();
    }

    @Override
    public String getGameLevel() {
        return "First Level";
    }
    public void checkForUpgrade(){
        if(gamePlay.getTotalPoints() > 10){
            SecondLevel secondLevel = new SecondLevel(gamePlay);
            gamePlay.setGameState(secondLevel);
            gamePlay.setTotalPoints(gamePlay.getTotalPoints() +1);
        }
    }
}
