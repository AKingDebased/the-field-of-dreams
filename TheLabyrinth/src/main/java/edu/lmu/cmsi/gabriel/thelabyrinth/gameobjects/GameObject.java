package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.core.Coordinate;

public abstract class GameObject{

	protected Coordinate location; //protected so child classes have access
	protected char renderedChar;

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

  protected abstract void verifyRenderedChar(char renderedChar); //protected so child classes have access
}