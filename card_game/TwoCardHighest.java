package card_game;

public class TwoCardHighest implements RuleSet{

  int numberOfPlayers;
  int initialHandSize;

  public TwoCardHighest(){
    this.numberOfPlayers = 2;
    this.initialHandSize = 2;
  }

  public int numberOfPlayers(){
    return this.numberOfPlayers;
  }

  public int getInitialHandSize(){
    return this.initialHandSize;
  }

  public Player selectWinner(Player player1, Player player2){
    Card player1Card1 = player1.playCard();
    Card player1Card2 = player1.playCard();
    int player1Total = player1Card1.getValue() + player1Card2.getValue();

    Card player2Card1 = player2.playCard();
    Card player2Card2 = player2.playCard();
    int player2Total = player2Card1.getValue() + player2Card2.getValue();

    if (player1Total > player2Total){
      return player1;
    } else if (player2Total > player1Total){
      return player2;
    } else{
      System.out.println("Both players scored the same - nobody wins!");
      return null;
    }


  }
}