import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class OneCardWinTest{

  RuleSet ruleSet;
  Player player1;
  Player player2;
  Player player3;
  Deck deck;
  Card card1;
  Card card2;
  ArrayList<Player> players;

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

    players = new ArrayList<Player>();

    deck = new Deck();
    deck.buildDeck();
    deck.shuffle();
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
    assertEquals(1, ruleSet.getInitialHandSize());
  }

  @Test
  public void highestCardWins(){
    
    players.add(player1);
    players.add(player2);
    assertEquals(player2, ruleSet.playAndSelectWinner(players, deck));
  }

  @Test
  public void continuesToDealAndPlayIfHandsEqual(){
    
    players.add(player2);
    players.add(player3);
    Player winner = ruleSet.playAndSelectWinner(players, deck);
    assertNotNull(winner);
    assertEquals(50, deck.size());
  }

 
  
}