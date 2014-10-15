package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;

public abstract class Monster extends GameCharacter{
	protected double hitChance;

	public Monster(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);
	}

	public <T extends GameObject> void checkCollision(T target){
		/*if (this.getX() == gameObject.getX() && this.getY() == gameObject.getY()){ //if there's a collision
			if(gameObject.getClass().equals(Player.class)){
				dealDamage(gameObject);
			} else if (gameObject.getClass().equals(Obstacle.class)) {
				if(gameObject.isWall()){
					this.displacement.invert();
				} else {
					this.hit();
				}
			}
		}*/
	}

	protected void dealDamage(GameObject gameObject){
		/*double hitNumber = Math.random();

		if(hitNumber > this.hitChance){
			gameObject.hit();
		}*/
	}
}