import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class OneCardWinTest{

  RuleSet ruleSet;
  Player player1;
  Player player2;
  Player player3;
  Card card1;
  Card card2;

  @Before
  public void before(){
    ruleSet = new OneCardWin();
    card1 = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
    card2 = new Card(CardSuit.CLUBS, CardValue.TEN);
    player1 = new Player("Player 1");
    player2 = new Player("Player 2");
    player3 = new Player("Player 3");
    player1.getHand().addToHand(card1);
    player2.getHand().addToHand(card2);
    player3.getHand().addToHand(card2);
  }

  @Test
  public void gameHasTwoPlayers(){
    assertEquals(2, ruleSet.numberOfPlayers());
  }

  @Test
  public void initialHandSizeDefined(){
    assertEquals(1, ruleSet.getInitialHandSize());
  }

  @Test
  public void highestCardWins(){
    assertEquals(player2, ruleSet.selectWinner(player1, player2));
  }

  @Test
  public void returnsNullIfNoWinner(){
    assertEquals(null, ruleSet.selectWinner(player2, player3));
  }
  
}