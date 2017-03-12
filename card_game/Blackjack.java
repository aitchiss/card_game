package card_game;
import java.util.*;

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

  public Player playAndSelectWinner(ArrayList<Player> players, Deck deck){
    Player player1 = players.get(0);
    Player player2 = players.get(1);

    int player1TotalHand = playerBuildsFinalTotal(player1, deck);
    if (bustOrNot(player1)){
      player1TotalHand = buildFinalTotalLowAces(player1, deck);
    }

    int player2TotalHand = playerBuildsFinalTotal(player2, deck);
    if (bustOrNot(player2)){
      player1TotalHand = buildFinalTotalLowAces(player2, deck);
    }

    //decide winner
    if (player1TotalHand > player2TotalHand && bustOrNot(player1) == false){
      return player1;
    } else if (player2TotalHand > player1TotalHand && bustOrNot(player2) == false){
      return player2;
    } else{
      return null;
    }
  }

  public Boolean bustOrNot(Player player){
    if (countValueOfHand(player) > 21){
      return true;
    } else{
      return false;
    }
  }


  public int playerBuildsFinalTotal(Player player, Deck deck){
    int total = countValueOfHand(player);
    while (hitOrNot(total) == true){
      deck.dealCardToPlayer(player);
      total = countValueOfHand(player);
      //could be amended to take a user input here, for whether or not they want to hit again - change to false when they say no
    }
    
    return total;
  }

  public int buildFinalTotalLowAces(Player player, Deck deck){
    int total = countHandLowAces(player);
    while (hitOrNot(total) == true){
      deck.dealCardToPlayer(player);
      total = countHandLowAces(player);
      //could be amended to take a user input here, for whether or not they want to hit again - change to false when they say no
    }
    return total;
  }

  public int countHandLowAces(Player player){
    int total = countValueOfHand(player);
    for (Card card : player.getHand().returnAllCards()){
      if (getBlackjackValue(card) == 11){
        total -= 10;
      }
    }
    return total;
  }


  public int countValueOfHand(Player player){
    int totalValue = 0;
    for (Card card : player.getHand().returnAllCards()){
      totalValue+= getBlackjackValue(card);
    }
    return totalValue;
  }



  public int getBlackjackValue(Card card){
    int normalCardValue = card.getValue();
    int blackjackValue;
    switch (normalCardValue){
      case 1: blackjackValue = 11;
              break;
      case 11: blackjackValue = 10;
              break;
      case 12: blackjackValue = 10;
              break;
      case 13: blackjackValue = 10;
              break;
      default: blackjackValue = normalCardValue;
              break;
    }
    return blackjackValue;
  }


//17 coded as threshold, since apparently dealer would have to abide by this rule normally -- this could be changed later to require user input - i.e. choose yes or no
  public Boolean hitOrNot(int currentTotal){
    if (currentTotal < 17){
      return true;
    } else {
      return false;
    }
  }


}