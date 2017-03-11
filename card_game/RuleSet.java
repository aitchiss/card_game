package card_game;

public interface RuleSet{

  public int numberOfPlayers();

  public int getInitialHandSize();

  public Player selectWinner(Player player1, Player player2);
}