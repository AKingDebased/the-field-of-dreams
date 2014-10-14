package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;

public abstract class Monster extends GameCharacter{

	public Monster(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);
	}

	public abstract void dealDamage(Player player);
}