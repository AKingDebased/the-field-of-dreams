package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Displacement;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Types;

public class GameCharacter extends GameObject{

	private Displacement displacement;

	///if no displacement is given, GameCharacter is assumed to be a player
	public GameCharacter(int x, int y, Types type){ 
		super(x,y,type);
		this.displacement = new Displacement(1, 0);
		
	}

	public GameCharacter(int x, int y, int dx, int dy, Types type){
		super(x,y,type);

		this.displacement = new Displacement(dx, dy);
		
	}

	public void update() {
    	this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
    	this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
 	}

 	public void checkCollision(GameObject entity) {
    	if (this.getX() == entity.getX() && this.getY() == entity.getY()) {
      		displacement.invert();
    	}
  	}

  	public void dealDamage(Character target){

  	}
}