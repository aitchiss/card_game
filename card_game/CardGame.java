package card_game;
import java.util.*;

public class CardGame{

  RuleSet ruleSet;
  ArrayList<Player> players;
  Deck deck;
  Boolean gameWon;
  Player winner;

  public CardGame(RuleSet ruleSet){
    this.ruleSet = ruleSet;
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    this.winner = null;
  }

  public void setup(){
    setupPlayers();
    setupDeck();
    setupHands();
  }

  public void play(){

    this.winner = this.ruleSet.playAndSelectWinner(this.players, this.deck);
    if (this.winner != null){
      System.out.println(this.winner.getName() + " wins!");
    } else{
      System.out.println("No winner this time - Suzanne's blackjack code made you both go bust!");
    }
    
  }

  public void setupHands(){
    for (int i = 0; i < ruleSet.getInitialHandSize(); i++){
      for (Player player : this.players){
        Card card = this.deck.dealCard();
        player.getHand().addToHand(card);
      }
    }
  }

  public Player getWinner(){
    return this.winner;
  }


  public void setupDeck(){
    this.deck.buildDeck();
    this.deck.shuffle();
  }

  public void setupPlayers(){
    int numberOfPlayers = this.ruleSet.numberOfPlayers();
    for (int i = 0; i < numberOfPlayers; i++){
      Player player = new Player("Player " + (i + 1));
      this.players.add(player);
    }
  }

  public int countPlayers(){
    return this.players.size();
  }

  public Player getPlayer(int number){
    return this.players.get(number - 1);
  }

  public Deck getDeck(){
    return this.deck;
  }

}
