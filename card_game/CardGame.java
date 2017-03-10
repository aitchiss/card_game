package card_game;
import java.util.*;

public class CardGame{

  RuleSet ruleSet;
  ArrayList<Player> players;
  Deck deck;

  public CardGame(RuleSet ruleSet){
    this.ruleSet = ruleSet;
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
  }

  public void setup(){
    setupPlayers();
    setupDeck();
  }

  public void setupDeck(){
    for (CardSuit suit : CardSuit.values()){
      for (CardValue cardValue : CardValue.values()){
        Card card = new Card(suit, cardValue);
        this.deck.addToDeck(card);
      }
    }

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

  public Deck getDeck(){
    return this.deck;
  }

}
