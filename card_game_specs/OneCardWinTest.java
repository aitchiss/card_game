import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class OneCardWinTest{

  RuleSet ruleSet;
  Card card1;
  Card card2;

  @Before
  public void before(){
    ruleSet = new OneCardWin();
    card1 = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
    card2 = new Card(CardSuit.CLUBS, CardValue.TEN);
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
    assertEquals(card2, ruleSet.selectWinningCard(card1, card2));
  }

  @Test
  public void returnsNullIfNoWinner(){
    assertEquals(null, ruleSet.selectWinningCard(card1, card1));
  }
  
}