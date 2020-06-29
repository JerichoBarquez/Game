package com.project.game.narrasoft;

public class PaperScissorRock {
	
	static int round = 100;

	public static void main(String[] args) {
		GameTime gTime = new GameTime();
		int count = 1;
		while (count <= round) {
			gTime.play();
			count++;
		}
		gTime.printResult(round);
	}
	
}
