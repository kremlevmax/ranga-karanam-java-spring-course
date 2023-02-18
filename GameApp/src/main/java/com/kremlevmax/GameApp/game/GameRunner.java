package com.kremlevmax.GameApp.game;

public class GameRunner {
	
	ConsoleGame consoleGame;

	public GameRunner(ConsoleGame consoleGame) {
		this.consoleGame = consoleGame;
	}	
	
	public void run() {
		consoleGame.up();
		consoleGame.down();
		consoleGame.left();
		consoleGame.right();
	}
}
