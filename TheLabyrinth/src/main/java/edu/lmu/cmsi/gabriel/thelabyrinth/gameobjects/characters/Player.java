package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;

public class Player extends GameCharacter{

	public Player(int x, int y, char renderedChar){
		super(x,y,renderedChar);
	}

	public void dealDamage(GameCharacter target){
		if(!target.isMonster()){
			return;
		}
	}
}