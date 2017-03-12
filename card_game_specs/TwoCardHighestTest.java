import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class TwoCardHighestTest{

  RuleSet ruleSet;
  Player player1;
  Player player2;
  Player player3;
  Card card1;
  Card card2;
  Card card3;
  Deck deck;

  @Before
  public void before(){
    ruleSet = new TwoCardHighest();

    card1 = new Card(CardSuit.DIAMONDS, CardValue.TWO);
    card2 = new Card(CardSuit.SPADES, CardValue.TEN);
    card3 = new Card(CardSuit.HEARTS, CardValue.QUEEN);

    deck = new Deck();
    deck.buildDeck();

    player1 = new Player("Player 1");
    player2 = new Player("Player 2");
    player3 = new Player("Player 3");

    player1.getHand().addToHand(card1);
    player1.getHand().addToHand(card2);
    //player 1 total value = 12

    player2.getHand().addToHand(card2);
    player2.getHand().addToHand(card3);
    //player 2 total value = 22

    player3.getHand().addToHand(card2);
    player3.getHand().addToHand(card3);
    //player 2 has same value as player2

  }

  @Test
  public void gameHasTwoPlayers(){
    assertEquals(2, ruleSet.numberOfPlayers());
  }

  @Test
  public void normalDealIsTwoCards(){
    assertEquals(2, ruleSet.numOfCardsInDeal());
  }

  @Test
  public void initialHandSizeDefined(){
    assertEquals(2, ruleSet.getInitialHandSize());
  }

  @Test
  public void greatestValueHandWins(){
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(player1);
    players.add(player2);
    assertEquals(player2, ruleSet.playAndSelectWinner(players, deck));
  }

  @Test

  public void continuesToDealAndPlayIfHandsEqual(){
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(player2);
    players.add(player3);
    Player winner = ruleSet.playAndSelectWinner(players, deck);
    assertNotNull(winner);
  }


}