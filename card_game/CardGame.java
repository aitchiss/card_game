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
    this.gameWon = false;
    this.winner = null;
  }

  public void setup(){
    setupPlayers();
    setupDeck();
    setupHands();
  }

  public void play(){
    // while (gameWon == false){
    //   this.winner = ruleSet.selectWinner(players.get(0), players.get(1));
    //   if (this.winner != null){
    //     System.out.println(this.winner.getName() + " wins!");
    //     gameWon = true;
    //   } else {
    //     for (int i = 0; i < ruleSet.numOfCardsInDeal(); i++){
    //       this.deck.dealCardToPlayers(this.players);
    //     }
    //   }
    // }
    this.winner = this.ruleSet.playAndSelectWinner(this.players, this.deck);
    System.out.println(this.winner.getName() + " wins!");

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
