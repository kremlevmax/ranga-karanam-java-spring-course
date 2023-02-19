package com.kremlevmax.GameApp.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.kremlevmax.GameApp.game")
public class GameApplication {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(GameApplication.class)){
		context.getBean(GameRunner.class).run();	
		}		
	}
}
