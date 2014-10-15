package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;

public class Wall extends Obstacle{
	public Wall(int x, int y){
		super(x,y,'w');
	}
}