package card_game;

public class OneCardWin implements RuleSet{

  int numberOfPlayers;
  int initialHandSize;
  int cardsInEachDeal;

  public OneCardWin(){
    this.numberOfPlayers = 2;
    this.initialHandSize = 1;
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
    Card player1Card = player1.playCard();
    Card player2Card = player2.playCard();
    if (player1Card.getValue() > player2Card.getValue()){
      return player1;
    } else if (player2Card.getValue() > player1Card.getValue()){
      return player2;
    } else {
      System.out.println("Both cards of same value - nobody wins!");
      return null;
    }
  }

  

  

}