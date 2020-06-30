package com.project.game.narrasoft;

import com.project.game.narrasoft.Player.Choice;
import com.project.game.narrasoft.Player.Play;

public class PaperScissorRock {

	static int tieScore = 0;
	static int playerScoreA = 0;
	static int playerScoreB = 0;
	static int round = 100;
	
	private Player gameA;
	private Player gameB;

	public PaperScissorRock() {
		this.gameA = new PlayerA();
		this.gameB = new PlayerB();
	}

	public static void main(String[] args) {
		PaperScissorRock game = new PaperScissorRock();
		int count = 1;
		while (count <= round) {
			game.play();
			count++;
		}
		print();
		printResult(round);
	}
	
	public void play() {
		Choice choiceA = gameA.playerChoice();
		Choice choiceB = gameB.playerChoice();
		
		if (choiceA == choiceB) {
			tieScore++;
		} else if (choiceB == Choice.ROCK) {
			playerScoreA++;
		} else if (choiceB == Choice.SCISSOR) {
			playerScoreB++;
		}
	}

	public static void printResult(int round) {
		if (playerScoreA > playerScoreB) {
			printPlayerWin(Play.A, playerScoreA, playerScoreB);
		} else if (playerScoreB > playerScoreA) {
			printPlayerWin(Play.B, playerScoreB, playerScoreA);
		}
	}
	public static void printPlayerWin(Play player, int playerWin, int playerLost) {
		System.out.println("Winner is Player " + player + " (" + playerWin + " to " + playerLost + " wins)");
	}
	
	public static void print() {
		System.out.println("Player " + Play.A + " wins " + playerScoreA + " of " + round + " games");
		System.out.println("Player " + Play.B + " wins " + playerScoreB + " of " + round + " games");
		System.out.println("Tie: " + tieScore + " of " + round + " games");
	}

}
