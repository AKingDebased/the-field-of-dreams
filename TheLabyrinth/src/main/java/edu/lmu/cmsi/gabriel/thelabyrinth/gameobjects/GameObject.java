package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

public class GameObject{

	private Coordinate location;
	private char renderedChar;

	public GameObject(int x, int y, char renderedChar){
		this.location = new Coordinate(x, y);
		this.renderedChar = renderedChar;
	}

	public int getX() {
    	return this.location.getX();
 	}

  	public int getY() {
    	return this.location.getY();
  	}

  	public char getRenderedChar(){
  		return this.renderedChar;
  	}
	
}