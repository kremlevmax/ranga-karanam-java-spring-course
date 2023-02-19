package com.kremlevmax.GameApp.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGame")
public class MarioGame implements ConsoleGame {
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go down the hole");
	}
	
	public void left() {
		System.out.println("Go to the left");
	}
	
	public void right() {
		System.out.println("Go to the right");
	}
}
