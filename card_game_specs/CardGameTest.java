import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

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

  @Test
  public void setupPlayersGivesPlayersNames(){
    cardGame.setup();
    assertEquals("Player 1", cardGame.getPlayer(1).getName());
  }

  @Test
  public void setupCreatesDeck(){
    cardGame.setupDeck();
    assertEquals(52, cardGame.getDeck().size());
  }

  @Test
  public void setupDealsFirstHand(){
    cardGame.setup();
    assertEquals(50, cardGame.getDeck().size());
  }

  @Test
  public void setupDealIncreasesPlayerHand(){
    cardGame.setup();
    assertEquals(1, cardGame.getPlayer(1).getHand().cardsInHand());
  }

  @Test
  public void playYieldsWinner(){
    cardGame.setup();
    cardGame.play();

  }

 


}