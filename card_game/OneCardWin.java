package card_game;
import java.util.*;

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

  public Player playAndSelectWinner(ArrayList<Player> players, Deck deck){

    Player player1 = players.get(0);
    Player player2 = players.get(1);

    Player winner = null;

    while (winner == null){
      Card player1Card = player1.playCard();
      Card player2Card = player2.playCard();
      
      if (player1Card.getValue() > player2Card.getValue()){
        winner = player1;
      } else if (player2Card.getValue() > player1Card.getValue()){
        winner = player2;
      } else {
        deck.dealCardToAllPlayers(players);
      }
    }
    return winner;

  }

  

  

}