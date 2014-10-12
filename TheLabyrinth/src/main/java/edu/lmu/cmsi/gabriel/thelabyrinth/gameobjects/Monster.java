package edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects;

import edu.lmu.cmsi.gabriel.thelabyrinth.core.Coordinate;
import edu.lmu.cmsi.gabriel.thelabyrinth.core.Displacement;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.Wall;

public abstract class Monster {

  private Coordinate location;
  private Displacement displacement;

  public Monster(int x, int y, int dx, int dy) {
    this.location = new Coordinate(x, y);
    this.displacement = new Displacement(dx, dy);
  }

  public int getX() {
    return this.location.getX();
  }

  public int getY() {
    return this.location.getY();
  }

  public void update() {
    this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
    this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
  }

  public void checkCollision(Wall w) {
    if (this.getX() == w.getX() && this.getY() == w.getY()) {
      displacement.invert();
    }
  }

  public abstract char getRenderedCharacter();

  public abstract dealDamage();

  // You need to know about all this if you want to continue down this path
  //public void checkCollision(Player m);
  //public void checkCollision(Boss b);
}