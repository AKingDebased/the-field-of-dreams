package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

public abstract class GameObject{

	private Coordinate location;

	public GameObject(int x, int y){
		this.location = new Coordinate(x, y);
	}

	public int getX() {
    	return this.location.getX();
 	}

  	public int getY() {
    	return this.location.getY();
  	}

  	public abstract char getRenderedCharacter();
	
}