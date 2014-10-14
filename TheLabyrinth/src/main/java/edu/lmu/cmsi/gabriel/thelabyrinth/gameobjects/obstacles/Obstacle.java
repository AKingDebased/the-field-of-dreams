package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;

public class Obstacle extends GameObject{

	private boolean isWall;

	public Obstacle(int x, int y, char renderedChar){
		super(x,y,renderedChar);

		isWall = renderedChar == 'w';
	}

	public void dealDamage(GameCharacter target){
		if(this.isWall){
			return;
		}

		target.hit();
	}
	
}