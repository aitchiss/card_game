package card_game;

public class OneCardWin implements RuleSet{

  int numberOfPlayers;
  int initialHandSize;

  public OneCardWin(){
    this.numberOfPlayers = 2;
    this.initialHandSize = 1;
  }

  public int numberOfPlayers(){
    return this.numberOfPlayers;
  }

  public int getInitialHandSize(){
    return this.initialHandSize;
  }

}