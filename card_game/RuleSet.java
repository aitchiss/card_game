package card_game;
import java.util.*;

public interface RuleSet{

  public int numberOfPlayers();

  public int getInitialHandSize();

  public Player playAndSelectWinner(ArrayList<Player> players, Deck deck);

  public int numOfCardsInDeal();
}