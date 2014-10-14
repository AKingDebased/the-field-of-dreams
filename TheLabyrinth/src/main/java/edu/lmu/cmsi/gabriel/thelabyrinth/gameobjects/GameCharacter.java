package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Displacement;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Types;

public abstract class GameCharacter extends GameObject{

	private Displacement displacement;
	private boolean isMonster;
	private int hitsTaken = 0;

	///if no displacement is given, GameCharacter is assumed to be a player
	public GameCharacter(int x, int y, char renderedChar){ 
		super(x,y,renderedChar);
		this.displacement = new Displacement(1, 0);
		this.isMonster = renderedChar != 'p';
	}

	public GameCharacter(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,renderedChar);

		this.displacement = new Displacement(dx, dy);
	}

	public void update() {
    	this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
    	this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
 	}

 	public void checkCollision(GameObject gameObject) {
    	if (this.getX() == gameObject.getX() && this.getY() == gameObject.getY()) {
      		displacement.invert();
      	}
  	}

  	public boolean isMonster(){
  		return isMonster;
  	}

  	public int getHitsTaken(){
  		return this.hitsTaken;
  	}

  	public void hit(){
  		this.hitsTaken++;
  	}
}