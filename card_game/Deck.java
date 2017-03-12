package card_game;
import java.util.*;

public class Deck{

  private ArrayList<Card> deckCards;

  public Deck(){
    this.deckCards = new ArrayList<Card>();
    
  }

  public void buildDeck(){
    for (CardSuit suit : CardSuit.values()){
      for (CardValue cardValue : CardValue.values()){
        Card card = new Card(suit, cardValue);
        this.deckCards.add(card);
      }
    }
  }

  public void addToDeck(Card card){
    deckCards.add(card);
  }

  public int size(){
    return this.deckCards.size();
  }

  public Card dealCard(){
    return deckCards.remove(0);
  }

  public void dealCardToPlayers(ArrayList<Player> players){
    for (Player player : players){
      Card card = dealCard();
      player.getHand().addToHand(card);
    }
  }

  public void shuffle(){
    Collections.shuffle(deckCards);
  }
}