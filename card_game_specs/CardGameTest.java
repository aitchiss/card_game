import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class CardGameTest{

  RuleSet ruleSet;
  CardGame cardGame;

  RuleSet twoCardHighest;
  CardGame twoCardHighestGame;

  @Before
  public void before(){
    ruleSet = new OneCardWin();
    cardGame = new CardGame(ruleSet);

    twoCardHighest = new TwoCardHighest();
    twoCardHighestGame = new CardGame(twoCardHighest);
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
    cardGame.setupPlayers();
    cardGame.setupDeck();
    Player player1 = cardGame.getPlayer(1);
    Player player2 = cardGame.getPlayer(2);

    Card card1 = new Card(CardSuit.HEARTS, CardValue.TEN);
    Card card2 = new Card(CardSuit.HEARTS, CardValue.FIVE);

    player1.getHand().addToHand(card1);
    player2.getHand().addToHand(card2);

    cardGame.play();

    assertEquals(player1, cardGame.getWinner());

  }

  //TwoCardHighest tests

  @Test
  public void setupDealsTwoCardToBothHands(){
    twoCardHighestGame.setup();
    assertEquals(48, twoCardHighestGame.getDeck().size());
  }

  @Test
  public void setupPlayerHandsHoldTwoCards(){
    twoCardHighestGame.setup();
    assertEquals(2, twoCardHighestGame.getPlayer(1).getHand().cardsInHand());
  }


  @Test

  public void twoCardGameYieldsWinner(){
    twoCardHighestGame.setupPlayers();
    twoCardHighestGame.setupDeck();
    Player player1 = twoCardHighestGame.getPlayer(1);
    Player player2 = twoCardHighestGame.getPlayer(2);

    Card card1 = new Card(CardSuit.HEARTS, CardValue.TEN);
    Card card2 = new Card(CardSuit.HEARTS, CardValue.FIVE);

    player1.getHand().addToHand(card1);
    player1.getHand().addToHand(card1);
    player2.getHand().addToHand(card2);
    player2.getHand().addToHand(card2);

    twoCardHighestGame.play();

    assertEquals(player1, twoCardHighestGame.getWinner());
  }
  

 


}