package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;

public abstract class Monster extends GameCharacter{
	private double hitChance;

	public Monster(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);
	}



	public void dealDamage(Player player){
		double hitNumber = Math.random();

		if(hitNumber > this.hitChance){
			player.hit();
		}
	}

	private void playerCollision(Player player){


	}

	private void obstacleCollision(Obstacle obstacle){
		
	}
}