package com.project.game.narrasoft;

import java.util.Random;

public class PlayerB extends Player {
	private Random random;
	public PlayerB() {
		random = new Random();
	}
	public Choice playerChoice() {
		int choice = random.nextInt(3) + 1;
		switch (choice) {
		case 1:
			return Choice.ROCK;
		case 2:
			return Choice.PAPER;
		}
		return Choice.SCISSOR;
	}

}
