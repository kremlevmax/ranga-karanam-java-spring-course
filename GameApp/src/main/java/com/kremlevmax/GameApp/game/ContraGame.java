package com.kremlevmax.GameApp.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ContraGame")
public class ContraGame implements ConsoleGame {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Sit");
	}

	@Override
	public void left() {
		System.out.println("Run Backwards");
	}

	@Override
	public void right() {
		System.out.println("Shoot");
	}

}
