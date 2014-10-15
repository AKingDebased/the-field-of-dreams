package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Wall;

public abstract class Monster extends GameCharacter{
	protected double hitChance;

	public Monster(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);
	}

	public <T extends GameObject> void checkCollision(T target){
		if (getX() == target.getX() && getY() == target.getY()){ //if there's a collision
			if (target instanceof Player){
				dealDamage(target);
			} else if (target instanceof Obstacle) {
				if(target instanceof Wall){
					this.displacement.invert();
				} else {
					this.hit();
				}
			}
		}
	}

	protected void dealDamage(GameObject gameObject){
		/*double hitNumber = Math.random();

		if(hitNumber > this.hitChance){
			gameObject.hit();
		}*/
	}
}