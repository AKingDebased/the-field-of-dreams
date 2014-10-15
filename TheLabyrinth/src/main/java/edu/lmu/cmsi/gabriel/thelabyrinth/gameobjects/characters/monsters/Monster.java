package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;

public abstract class Monster extends GameCharacter{
	protected double hitChance;

	public Monster(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);
	}

	public void checkCollision(Player player){
		if (getX() == player.getX() && getY() == player.getY()){ //if there's a collision
			dealDamage(player);
		}
	}

	private void dealDamage(Player player){
		double hitNumber = Math.random();

		if(hitNumber > this.hitChance){
			player.hit();
		}
	}
}