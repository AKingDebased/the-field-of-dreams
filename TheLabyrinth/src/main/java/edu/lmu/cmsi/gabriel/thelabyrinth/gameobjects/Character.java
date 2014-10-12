package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;

public class Character extends GameObject{

	private Displacement displacement;

	public Character(int x, int y, char renderedChar, int dx, int dy){
		super(x,y,renderedChar);
		this.displacement = new Displacement(dx, dy);
	}

	public void update() {
    	this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
    	this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
 	}

 	public void checkCollision(Gameobject wall) {
    	if (this.getX() == w.getX() && this.getY() == w.getY()) {
      		displacement.invert();
    	}
  	}

  	public void dealDamage(Character target){

  	}
}