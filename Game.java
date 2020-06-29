package com.project.game.narrasoft;

public abstract class Game {
	
	enum Choice {ROCK, PAPER ,SCISSOR}
	enum Player {A, B}
	
	public abstract Choice playerChoice();
    
}
