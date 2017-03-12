import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class BlackjackTest{

  RuleSet ruleSet;
  Player player1;
  Player player2;
  Deck deck;
  ArrayList<Player> players;
  Card card1;
  Card card2;
  Blackjack blackjack;

  @Before
  public void before(){
    ruleSet = new Blackjack();
    blackjack = (Blackjack) ruleSet;

    player1 = new Player("Player 1");
    player2 = new Player("player 2");

    players = new ArrayList<Player>();

    deck = new Deck();
    deck.buildDeck();

    card1 = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
    card2 = new Card(CardSuit.CLUBS, CardValue.TEN);

    player1.getHand().addToHand(card1);
    player1.getHand().addToHand(card2);

  }

  @Test
  public void gameHasTwoPlayers(){
    assertEquals(2, ruleSet.numberOfPlayers());
  }

  @Test
  public void normalDealIsOneCard(){
    assertEquals(1, ruleSet.numOfCardsInDeal());
  }

  @Test
  public void initialHandSizeDefined(){
    assertEquals(2, ruleSet.getInitialHandSize());
  }

  @Test 
  public void countInitialHand(){
    assertEquals(15, blackjack.playerCountInitialHand(player1));
  }

  @Test
  public void playerHits(){
    assertEquals(true, blackjack.hitOrNot(15));
  }

  @Test
  public void playerDoesntHit(){
    assertEquals(false, blackjack.hitOrNot(18));
  }

  @Test
  public void kingHasValueTen(){
    Card card = new Card(CardSuit.HEARTS, CardValue.KING);
    assertEquals(10, blackjack.getBlackJackValue(card));
  }

  @Test
  public void aceHasValueEleven(){
    Card card = new Card(CardSuit.HEARTS, CardValue.ACE);
    assertEquals(11, blackjack.getBlackJackValue(card));
  }

  @Test
  public void fiveStillHasValueFive(){
    assertEquals(5, blackjack.getBlackJackValue(card1));
  }

}