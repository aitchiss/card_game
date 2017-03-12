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
    return player1; //just as placeholder for now!
  }

  public int playerCountInitialHand(Player player){
    Card card1 = player.playCard();
    Card card2 = player.playCard();
    int totalHandValue = card1.getValue() + card2.getValue();
    return totalHandValue;
  }

  public int getBlackJackValue(Card card){
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


//17 coded as threshold, since apparently dealer would have to abide by this rule normally
  public Boolean hitOrNot(int currentTotal){
    if (currentTotal < 17){
      return true;
    } else {
      return false;
    }
  }


}