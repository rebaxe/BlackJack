package view;

/**
 * Encapsulates the generic view functionality.
 */
public interface View {

  /**
   * Represents an action.
   */
  public enum Action {
    PLAY,
    HIT,
    STAND,
    QUIT,
    None;
  }

  /**
   * Shows a welcome message.
   */
  void displayWelcomeMessage();

  /**
   * Returns pressed characters from the keyboard.

   * @return The pressed character.
   */
  int getInput();

  /**
   * Returns an action.

   * @return The action represented by a pressed character.
   */
  Action promptForAction();

  /**
   * Displays a card.

   * @param card The card to display.
   */
  void displayCard(model.Card card);

  /**
   * Displays the cards and score of the player.

   * @param hand The player's hand.
   * @param score The player's score.
   */
  void displayPlayerHand(Iterable<model.Card> hand, int score);

  /**
   * Displays the cards and score of the dealer.

   * @param hand The dealer's score.
   * @param score The players's score.
   */
  void displayDealerHand(Iterable<model.Card> hand, int score);

  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  void displayGameOver(boolean dealerIsWinner);
}