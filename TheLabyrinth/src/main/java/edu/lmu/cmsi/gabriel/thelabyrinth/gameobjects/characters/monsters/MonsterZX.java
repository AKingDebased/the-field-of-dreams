package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;

public class MonsterZX extends Monster {

	public MonsterZX(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);

		verifyRenderedChar(super.renderedChar);

		this.hitChance = 0.5;
	}

	public void checkCollision(GameObject gameObject){
		if (gameObject instanceof Player ){	//if we hit the player
			playerCollision((Player) gameObject);
		} else if (gameObject instanceof Obstacle){		//if we hit an obstacle
			objectCollision((Obstacle) gameObject);
		}
	}

	protected void verifyRenderedChar(char renderedChar){
		if (renderedChar == 'z' || renderedChar == 'x'){
			return;
		} else{
			throw new IllegalArgumentException();
		}
	}
}