package card_game;
import java.util.*;

public class CardGame{

  RuleSet ruleSet;
  ArrayList<Player> players;

  public CardGame(RuleSet ruleSet){
    this.ruleSet = ruleSet;
    this.players = new ArrayList<Player>();
  }

  public void setup(){
    setupPlayers();
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

}
