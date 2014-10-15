package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.Monster;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.MonsterAS;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.MonsterZX;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.BossOK;

public class Player extends GameCharacter{

	public Player(int x, int y, char renderedChar){
		super(x,y,renderedChar);
		verifyRenderedChar(renderedChar);
	}

	public void checkCollision(GameObject gameObject){
		//this.getX() == w.getX() && this.getY() == w.getY()
	}

	public void dealDamage(Monster monster){
		double hitChance = Math.random();

		if(monster instanceof MonsterAS || monster instanceof MonsterZX){
			if (hitChance > 0.5){
				monster.hit();
			}
		} else if (monster instanceof BossOK){
			if (hitChance > 0.7){
				monster.hit();
			}
		} else {
			return;
		}
	}

	private void monsterCollision(Monster monster){

	}

	private void objectCollision(Obstacle obstacle){

	}

	protected void verifyRenderedChar(char renderedChar){
		if (renderedChar != 'p'){
			throw new IllegalArgumentException();
		}
	}
}