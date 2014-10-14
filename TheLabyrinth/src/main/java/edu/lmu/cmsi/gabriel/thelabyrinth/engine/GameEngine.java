package edu.lmu.cmsi.gabriel.thelabyrinth.engine;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.MonsterZX;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.MonsterAS;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.BossOK;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.monsters.Monster;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.characters.Player;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.obstacles.Obstacle;

public class GameEngine {

  private int frame;
  private int size;

  // Game Objects
  private Obstacle[] walls;
  private Player player;
  private Monster[] monsters;

  public GameEngine(int size) {

    if (size < 1) {
      throw new IllegalArgumentException("the world should exist.  sorry sartre.");
    }
    this.frame = 0;
    this.size = size;

    // do this in a separate method to keep the constructor clean
    this.createWalls();

    this.player = new Player(2, 2, 'p');

    this.monsters = new Monster[6];
    this.monsters[0] = new MonsterZX(4, 3, 1, 0, 'z');
    this.monsters[1] = new MonsterZX(9, 9, 0, 1, 'x');
    this.monsters[2] = new MonsterAS(8, 7, 1, 1, 'a');
    this.monsters[3] = new MonsterAS(1, 1, 1, 0, 's');
    this.monsters[4] = new BossOK(5, 5, 1, 0, 'o');
    this.monsters[5] = new BossOK(8, 8, 0, 1, 'k');
  }

  private void createWalls() {
    // Let's create walls
    //for now, we only care about putting walls on the edges

    int wallCount = 0;
    // calculate the amount of walls we'll need
    this.walls = new Obstacle[this.size * 4 - 4];

    for (int x = 0; x < this.size; x++) {
      Obstacle x1 = new Obstacle(x, 0, 'w');
      walls[wallCount++] = x1;
      Obstacle x2 = new Obstacle(x, this.size - 1,'w');
      walls[wallCount++] = x2;
    }

    for (int y = 1; y < size - 1; y++) {
      Obstacle y1 = new Obstacle(0, y,'w');
      walls[wallCount++] = y1;
      Obstacle y2 = new Obstacle(this.size - 1, y,'w');
      walls[wallCount++] = y2;
    }
  }

  // the main update loop
  public void update() {
    this.frame++;
    this.render();
    this.updateObjects();
    this.checkCollisions();
  }

  private void render() {
    // Strings are a bit overkill here but easier to represent a String as a null than a character
    String[][] renderedWorld = new String[this.size][this.size];

    //walls
    for (int i = 0; i < this.walls.length; i++) {
      Obstacle w = this.walls[i];
      renderedWorld[w.getY()][w.getX()] = Character.toString(w.getRenderedChar());
    }

    renderedWorld[this.player.getY()][this.player.getX()] =
        Character.toString(this.player.getRenderedChar());

    // monsters
    for (int i = 0; i < this.monsters.length; i++) {
      Monster m = this.monsters[i];
      renderedWorld[m.getY()][m.getX()] = Character.toString(m.getRenderedChar());
    }

    System.out.println("=========================");
    System.out.println("Frame: " + this.frame);  // book keeping

    for (int row = 0; row < renderedWorld.length; row++) {
      String[] rowOfWorld = renderedWorld[row];
      for (int col = 0; col < rowOfWorld.length; col++) {
        String w = rowOfWorld[col];
        // If our string is null
        if (w == null) {
          w = ".";
        }
        System.out.print(w + " ");
      }
      System.out.println(""); // print a new line between each scene
    }

    System.out.println("=========================");

    displayHitsTaken();
  }

  private void displayHitsTaken(){ // separate method to keep render() organized
    System.out.println("player hits taken: " + player.getHitsTaken());
    System.out.println("monster z hits taken: " + player.getHitsTaken());
    System.out.println("monster x hits taken: " + player.getHitsTaken());
    System.out.println("monster a hits taken: " + player.getHitsTaken());
    System.out.println("monster s hits taken: " + player.getHitsTaken());
  }

  private void updateObjects() {
    // duplication's gone, baby

    this.player.update();

    for (int i = 0; i < this.monsters.length; i++) {
      this.monsters[i].update();
    }
  }

  private void checkCollisions() {
    for (int i = 0; i < this.walls.length; i++) {
      Obstacle w = this.walls[i];
      this.player.checkCollision(w);
    }

    for (int i = 0; i < this.walls.length; i++) {
      Obstacle w = this.walls[i];
      for (int j = 0; j < this.monsters.length; j++) {
        this.monsters[j].checkCollision(w);
      }
    }
  }
}