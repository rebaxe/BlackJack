package model.rules;

import model.Card;
import model.Card.Value;
import model.Player;

class Soft17HitStrategy implements HitStrategy {
  private static final int hitLimit = 17;

  public boolean doHit(Player dealer) {
    if (dealer.calcScore() == hitLimit) {
      return hasAce(dealer.getHand());
    } 
    return dealer.calcScore() < hitLimit;
  }

  private boolean hasAce(Iterable<Card> hand) {
    for (Card card : hand) {
      if (card.getValue() == Value.Ace) {
        return true;
      }
    }
    return false;
  }
}
