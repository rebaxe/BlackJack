package controller;

import model.Game;
import model.rules.AmericanSoft17PlayerAdvantageFactory;
import model.rules.RulesFactory;
import view.EnglishView;
// import view.SwedishView;
import view.View;

/**
 * Starts the application using the console.
 */
public class App {
  /**
   * Starts the game.

  * @param args Not used.
  */
  public static void main(String[] args) {
    RulesFactory r = new AmericanSoft17PlayerAdvantageFactory();
    Game g = new Game(r);
    View v = new EnglishView(); // new SwedishView();
    // View v = new SwedishView();
    Player ctrl = new Player(v, g);

    v.displayWelcomeMessage();
    
    while (ctrl.play()) {

    }
  }
}