package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;

public class BossOK extends Monster{

	public BossOK(int x, int y, int dx, int dy, char renderedChar){
		super(x,y,dx,dy,renderedChar);
		
		verifyRenderedChar(renderedChar);
	}

	public void dealDamage(Player player){
		//
	}

	protected void verifyRenderedChar(char renderedChar){
		if (renderedChar == 'o' || renderedChar == 'k'){
			return;
		} else{
			throw new IllegalArgumentException();
		}
	}
}