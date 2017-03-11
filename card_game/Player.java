package card_game;

public class Player{

  private Hand hand;
  private String name;

  public Player(String name){
    this.name = name;
    this.hand = new Hand();
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }

  public Card playCard(){
    return this.hand.removeCard();
  }


}