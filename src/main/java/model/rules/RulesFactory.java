package model.rules;

/**
 * Creates concrete rules.
 */
public class RulesFactory {

  /**
   * Creates the rule to use for the dealer's hit behavior.

   * @return The rule to use
   */
  public HitStrategy getHitRule() {
    // return new BasicHitStrategy();
    return new Soft17HitStrategy();
  }

  /**
   * Creates the rule to use when starting a new game.

   * @return The rule to use.
   */
  public NewGameStrategy getNewGameRule() {
    return new AmericanNewGameStrategy();
  }

  /**
   * Creates the rule to use for deciding the winner.

   * @return The rule to use.
   */
  public WinStrategy getWinRule() {
    return new DealerAdvantageWinStrategy();
    // return new PlayerAdvantageWinStrategy();
  }
}