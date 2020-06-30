package com.project.game.narrasoft;

public abstract class Player {
	
	enum Choice {ROCK, PAPER ,SCISSOR}
	enum Play {A, B}
	
	public abstract Choice playerChoice();
    
}
