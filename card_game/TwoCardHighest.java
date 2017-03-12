package card_game;
import java.util.*;

public class TwoCardHighest implements RuleSet{

  int numberOfPlayers;
  int initialHandSize;
  int cardsInEachDeal;

  public TwoCardHighest(){
    this.numberOfPlayers = 2;
    this.initialHandSize = 2;
    this.cardsInEachDeal = 2;
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
      int player1Total = getPlayerHandTotal(player1);
      int player2Total = getPlayerHandTotal(player2);

      if (player1Total > player2Total){
        winner = player1;
      } else if (player2Total > player1Total){
        winner = player2;
      } else{
        deck.dealCardToAllPlayers(players);
        deck.dealCardToAllPlayers(players);
      }
    }
    return winner;

  }

  public int getPlayerHandTotal(Player player){
    Card playerCard1 = player.playCard();
    Card playerCard2 = player.playCard();
    int playerTotal = playerCard1.getValue() + playerCard2.getValue();
    return playerTotal;
  }

}