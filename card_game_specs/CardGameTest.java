import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardGameTest{

  RuleSet ruleSet;
  CardGame cardGame;

  @Before
  public void before(){
    ruleSet = new OneCardWin();
    cardGame = new CardGame(ruleSet);
  }
  


  @Test
  public void setupCreatesTwoPlayersForOneCardWin(){
    cardGame.setup();
    assertEquals(2, cardGame.countPlayers());
  }
}