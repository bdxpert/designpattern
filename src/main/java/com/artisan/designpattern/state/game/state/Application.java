package com.artisan.designpattern.state.game.state;

import com.artisan.designpattern.state.game.state.FirstLevel;
import com.artisan.designpattern.state.game.state.GamePlay;
import com.artisan.designpattern.state.game.state.GameState;

public class Application {

	public static void main(String[] args) {
		GamePlay gamePlay = new GamePlay();
		GameState gameState = new FirstLevel(gamePlay);
		gamePlay.setGameState(gameState);
		gamePlay.addPoints(10);
		System.out.println("Game Level: "+gamePlay.getGameLevel());
		System.out.println("Points: "+gamePlay.getTotalPoints());
		gamePlay.addPoints(15);
		System.out.println("Game Level: "+gamePlay.getGameLevel());
		System.out.println("Points: "+gamePlay.getTotalPoints());

		/*
		Game game = new Game();
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();
		*/
	}

}
