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

  public Card selectWinningCard(Card card1, Card card2){
    if (card1.getValue() > card2.getValue()){
      return card1;
    } else if (card2.getValue() > card1.getValue()){
      return card2;
    } else {
      return null;
    }
  }

}