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

	public void checkCollision(GameObject gameObject){
		if (gameObject instanceof Player ){	//if we hit the player
			playerCollision((Player) gameObject);
		} else if (gameObject instanceof Obstacle){		//if we hit an obstacle
			objectCollision((Obstacle) gameObject);
		}
	}

	protected void verifyRenderedChar(char renderedChar){
		if (renderedChar == 'a' || renderedChar == 's'){
			return;
		} else{
			throw new IllegalArgumentException();
		}
	}
}