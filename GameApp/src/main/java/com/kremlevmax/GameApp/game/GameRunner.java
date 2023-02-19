package com.kremlevmax.GameApp.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	ConsoleGame consoleGame;

	public GameRunner(@Qualifier("ContraGame") ConsoleGame consoleGame) {
		this.consoleGame = consoleGame;
	}	
	
	public void run() {
		consoleGame.up();
		consoleGame.down();
		consoleGame.left();
		consoleGame.right();
	}
}
