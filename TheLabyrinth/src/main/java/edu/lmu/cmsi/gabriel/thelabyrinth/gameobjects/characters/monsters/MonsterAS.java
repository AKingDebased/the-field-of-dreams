package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;

public class MonsterAS extends Monster {

	public MonsterAS(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);

		verifyRenderedChar(renderedChar);

		this.hitChance = 0.4;
	}

	protected void verifyRenderedChar(char renderedChar){
		if (renderedChar == 'a' || renderedChar == 's'){
			return;
		} else{
			throw new IllegalArgumentException();
		}
	}
}