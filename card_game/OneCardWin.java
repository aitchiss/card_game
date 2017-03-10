package card_game;

public class OneCardWin implements RuleSet{

  int numberOfPlayers;

  public OneCardWin(){
    this.numberOfPlayers = 2;
  }

  public int numberOfPlayers(){
    return this.numberOfPlayers;
  }
}