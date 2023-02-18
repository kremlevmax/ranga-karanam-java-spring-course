package com.kremlevmax.GameApp.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameApplication {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(GameApplicationConfiguration.class)){
		context.getBean(GameRunner.class).run();	
		}		
	}
}
