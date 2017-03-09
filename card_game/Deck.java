package card_game;
import java.util.*;

public class Deck{

  private ArrayList<Card> deckCards;

  public Deck(){
    this.deckCards = new ArrayList<Card>();
  }

  public void addToDeck(Card card){
    deckCards.add(card);
  }

  public int size(){
    return this.deckCards.size();
  }
}