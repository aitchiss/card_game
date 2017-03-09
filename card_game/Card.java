package card_game;

public class Card{

  private CardValue value;
  private CardSuit suit;

  public Card(CardSuit suit, CardValue value){
    this.suit = suit;
    this.value = value;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public int getValue(){
    return this.value.cardValue();
  }

  public String getValueName(){
    return this.value.valueName();
  }
}