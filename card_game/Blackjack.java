package card_game;

public class Blackjack implements RuleSet{

  private int numberOfPlayers;
  private int initialHandSize;
  private int cardsInEachDeal;

  public Blackjack(){
    this.numberOfPlayers = 2;
    this.initialHandSize = 2;
    this.cardsInEachDeal = 1;
  }

  public int numberOfPlayers(){
    return this.numberOfPlayers;
  }

  public int getInitialHandSize(){
    return this.initialHandSize;
  }

  public int numOfCardsInDeal(){
    return this.cardsInEachDeal;
  }

  public Player selectWinner(Player player1, Player player2){
    return player1; //just as placeholder for now!
  }

  public int playerCountInitialHand(Player player){
    Card card1 = player.playCard();
    Card card2 = player.playCard();
    int totalHandValue = card1.getValue() + card2.getValue();
    return totalHandValue;
  }


//17 coded as threshold, since apparently dealer would have to abide by this rule normally
  public Boolean playerDecidesHitOrNot(int currentTotal){
    if (currentTotal < 17){
      return true;
    } else {
      return false;
    }
  }


}