package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.core.Coordinate;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Types;

public class GameObject{

	protected Coordinate location; //protected so that child classes have access
	protected Types type;

	public GameObject(int x, int y, Types type){
		this.location = new Coordinate(x, y);
		this.type = type;
	}

	public int getX() {
    	return this.location.getX();
 	}

  	public int getY() {
    	return this.location.getY();
  	}

  	public char getRenderedChar(){
  		return this.type.getRenderedChar();
  	}
	
}