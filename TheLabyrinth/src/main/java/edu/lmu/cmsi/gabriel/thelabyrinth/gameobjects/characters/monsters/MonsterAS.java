package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;

public class MonsterAS extends Monster {

	public MonsterAS(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);

		verifyRenderedChar(renderedChar);
	}

	public void dealDamage(Player player){
		double hitChance = Math.random();

		if(hitChance > 0.4){
			player.hit();
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