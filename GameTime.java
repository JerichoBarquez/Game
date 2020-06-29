package com.project.game.narrasoft;

import com.project.game.narrasoft.Game.Choice;
import com.project.game.narrasoft.Game.Player;

public class GameTime {

	private PlayerA playerA;
	private PlayerB playerB;

	static int tieScore = 0;
	static int playerScoreA = 0;
	static int playerScoreB = 0;

	public GameTime() {
		playerA = new PlayerA();
		playerB = new PlayerB();
	}

	public void play() {
		Choice choiceA = playerA.playerChoice();
		Choice choiceB = playerB.playerChoice();
		
		if (choiceA == choiceB) {
			tieScore++;
		} else if (choiceB == Choice.ROCK) {
			playerScoreA++;
		} else if (choiceB == Choice.SCISSOR) {
			playerScoreB++;
		}
	}

	public static void printResult(int round) {
		
		System.out.println("Player " + Player.A + " wins " + playerScoreA + " of " + round + " games");
		System.out.println("Player " + Player.B + " wins " + playerScoreB + " of " + round + " games");
		System.out.println("Tie: " + tieScore + " of " + round + " games");
		
		if (playerScoreA > playerScoreB) {
			printPlayerWin(Player.A, playerScoreA, playerScoreB);
		} else if (playerScoreB > playerScoreA) {
			printPlayerWin(Player.B, playerScoreB, playerScoreA);
		}
	}

	public static void printPlayerWin(Player player, int playerWin, int playerLost) {
		System.out.println("Winner is Player " + player + " (" + playerWin + " to " + playerLost + " wins)");
	}

}
