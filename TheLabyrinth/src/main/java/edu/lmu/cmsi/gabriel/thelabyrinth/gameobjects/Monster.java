package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.core.Coordinate;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Displacement;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.Wall;

public class Monster extends Character {

  public Monster(int x, int y, int dx, int dy) {
    super(x, y, dx, dy);
  }

  public char getRenderedCharacter(){
      return 'a';
  }

  public abstract dealDamage();

  // You need to know about all this if you want to continue down this path
  //public void checkCollision(Player m);
  //public void checkCollision(Boss b);
}