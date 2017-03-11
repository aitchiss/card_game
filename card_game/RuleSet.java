package card_game;

public interface RuleSet{

  public int numberOfPlayers();

  public int getInitialHandSize();

  public Card selectWinningCard(Card card1, Card card2);
}