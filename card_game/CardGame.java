package card_game;
import java.util.*;

public class CardGame{

  RuleSet ruleSet;
  ArrayList<Player> players;
  Deck deck;
  int handSize;

  public CardGame(RuleSet ruleSet){
    this.ruleSet = ruleSet;
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    this.handSize =ruleSet.getInitialHandSize();
  }

  public void setup(){
    setupPlayers();
    setupDeck();
    setupHands();
  }

  public void setupHands(){
    for (int i = 0; i < this.handSize; i++){
      for (Player player : this.players){
        Card card = this.deck.dealCard();
        player.getHand().addToHand(card);
      }

    }
  }

  public void setupDeck(){
    for (CardSuit suit : CardSuit.values()){
      for (CardValue cardValue : CardValue.values()){
        Card card = new Card(suit, cardValue);
        this.deck.addToDeck(card);
      }
    }
    this.deck.shuffle();
  }

  public void setupPlayers(){
    int numberOfPlayers = this.ruleSet.numberOfPlayers();
    for (int i = 0; i < numberOfPlayers; i++){
      Player player = new Player("Player" + (i + 1));
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
