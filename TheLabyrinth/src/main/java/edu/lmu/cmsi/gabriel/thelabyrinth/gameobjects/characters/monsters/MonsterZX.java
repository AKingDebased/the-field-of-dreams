package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;

public class MonsterZX extends Monster {

	public MonsterZX(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);

		verifyRenderedChar(super.renderedChar);
	}

	public void dealDamage(Player player){
		double hitChance = Math.random();

		if(hitChance > 0.5){
			player.hit();
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