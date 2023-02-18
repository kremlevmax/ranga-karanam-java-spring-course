package com.kremlevmax.GameApp.game;

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
