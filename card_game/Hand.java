package card_game;
import java.util.*;

public class Hand{

  private ArrayList<Card> currentHand;

  public Hand(){
    this.currentHand = new ArrayList<Card>();
  }

  public void addToHand(Card card){
    this.currentHand.add(card);
  }

  public int cardsInHand(){
    return this.currentHand.size();
  }

  public Card removeCard(){
    return this.currentHand.remove(0);
  }

  public ArrayList<Card> returnAllCards(){
    return this.currentHand;
  }



}