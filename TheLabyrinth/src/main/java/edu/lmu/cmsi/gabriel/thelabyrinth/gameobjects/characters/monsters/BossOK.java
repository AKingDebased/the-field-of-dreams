package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;

public class BossOK extends Monster{

	public BossOK(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);

		verifyRenderedChar(renderedChar);

		this.hitChance = 0.3;
	}

	protected void verifyRenderedChar(char renderedChar){
		if (renderedChar == 'o' || renderedChar == 'k'){
			return;
		} else{
			throw new IllegalArgumentException();
		}
	}
}