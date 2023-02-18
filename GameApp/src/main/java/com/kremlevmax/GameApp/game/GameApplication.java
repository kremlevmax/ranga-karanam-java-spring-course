package com.kremlevmax.GameApp.game;

public class GameApplication {

	public static void main(String[] args) {
		var marioGame = new MarioGame(); 
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
