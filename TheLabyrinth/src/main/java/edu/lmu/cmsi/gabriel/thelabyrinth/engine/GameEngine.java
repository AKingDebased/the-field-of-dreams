package edu.lmu.cmsi.gabriel.thelabyrinth.engine;

import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameObject;
import edu.lmu.cmsi.gabriel.thelabyrinth.gameobjects.GameCharacter;

public class GameEngine {

  private int frame;
  private int size;

  // Game Objects
  private GameObject[] walls;
  private GameCharacter player;
  private GameCharacter[] monsters;

  public GameEngine(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("the world should exist.  sorry sartre.");
    }
    this.frame = 0;
    this.size = size;

    // do this in a separate method to keep the constructor clean
    this.createWalls();

    this.player = new GameCharacter(3, 4, 'p');
    this.monsters = new GameCharacter[4];
    this.monsters[0] = new GameCharacter(4, 3, 1, 0, 'z');
    this.monsters[1] = new GameCharacter(10, 12, 0, 1, 'x');
    this.monsters[2] = new GameCharacter(8, 17, 1, 1, 'a');
    this.monsters[3] = new GameCharacter(1, 1, 0, 0, 's');
  }

  private void createWalls() {
    // Let's create walls
    //for now, we only care about putting walls on the edges

    int wallCount = 0;
    // calculate the amount of walls we'll need
    this.walls = new GameObject[this.size * 4 - 4];

    for (int x = 0; x < this.size; x++) {
      GameObject x1 = new GameObject(x, 0, 'w');
      walls[wallCount++] = x1;
      GameObject x2 = new GameObject(x, this.size - 1,'w');
      walls[wallCount++] = x2;
    }

    for (int y = 1; y < size - 1; y++) {
      GameObject y1 = new GameObject(0, y,'w');
      walls[wallCount++] = y1;
      GameObject y2 = new GameObject(this.size - 1, y,'w');
      walls[wallCount++] = y2;
    }
  }

  // the main upadte loop
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
      GameObject w = this.walls[i];
      renderedWorld[w.getY()][w.getX()] = Character.toString(w.getRenderedChar());
    }

    renderedWorld[this.player.getY()][this.player.getX()] =
        Character.toString(this.player.getRenderedChar());

    // monster
    for (int i = 0; i < this.monsters.length; i++) {
      GameCharacter m = this.monsters[i];
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
  }

  private void updateObjects() {
    // everytime we add a new game object, we've got to go back through
    // every other place and add in more code - such duplication
    this.player.update();
    for (int i = 0; i < this.monsters.length; i++) {
      this.monsters[i].update();
    }
  }

  private void checkCollisions() {
    for (int i = 0; i < this.walls.length; i++) {
      GameObject w = this.walls[i];
      this.player.checkCollision(w);
    }
    for (int i = 0; i < this.walls.length; i++) {
      GameObject w = this.walls[i];
      for (int j = 0; j < this.monsters.length; j++) {
        this.monsters[j].checkCollision(w);
      }
    }
  }
}