import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class OneCardWinTest{

  RuleSet ruleSet;

  @Before
  public void before(){
    ruleSet = new OneCardWin();
  }

  @Test
  public void gameHasTwoPlayers(){
    assertEquals(2, ruleSet.numberOfPlayers());
  }

  @Test
  public void initialHandSizeDefined(){
    assertEquals(1, ruleSet.getInitialHandSize());
  }
  
}