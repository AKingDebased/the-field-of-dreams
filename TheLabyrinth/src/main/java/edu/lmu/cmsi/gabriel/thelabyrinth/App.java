package edu.lmu.cmsi.gabriel.thelabyrinth;

import java.util.Scanner;

import edu.lmu.cmsi.gabriel.thelabyrinth.engine.GameEngine;

public class App {

  private Scanner keyboard = null;
  private GameEngine engine;

  public App() {
    System.out.println("welcome to the labyrinth");
    System.out.println("commands are: [n]ext frame or [q]uit");
    this.keyboard = new Scanner(System.in);
    this.engine = new GameEngine(20);
  }

  /*
   Returns the lower case String of the keyboard input
   */
  private String getInput() {
    return this.keyboard.next().toLowerCase();
  }

  public static void main(String[] args) {
    App theApp = new App();
    String input = theApp.getInput();

    while (!input.equals("q")) {
      if (input.equals("n")) {
        theApp.engine.update();
      }

      input = theApp.getInput();
    }
  }
}
