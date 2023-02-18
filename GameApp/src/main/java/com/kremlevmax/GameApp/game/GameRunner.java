package com.kremlevmax.GameApp.game;

public class GameRunner {
	
	MarioGame marioGame;

	public GameRunner(MarioGame marioGame) {
		this.marioGame = marioGame;
	}	
	
	public void run() {
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
	}
}
