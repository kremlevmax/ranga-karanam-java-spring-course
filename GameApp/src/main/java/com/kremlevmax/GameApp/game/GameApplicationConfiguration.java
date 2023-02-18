package com.kremlevmax.GameApp.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameApplicationConfiguration {

	@Bean
	@Primary
	@Qualifier("MarioGame")
	public MarioGame marioGame() {
		return new MarioGame();
	}
	
	@Bean
	@Qualifier("ContraGame")
	public ContraGame contraGame() {
		return new ContraGame();
	}
	
	@Bean GameRunner gameRunner(ConsoleGame consoleGame) {
		return new GameRunner(consoleGame);
	}
}
