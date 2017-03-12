import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class DeckTest{

  Card card1;
  Card card2;
  Card card3;
  Card card4;
  Deck deck;
  Deck deck2;
  Hand hand;

  @Before
  public void before(){
    card1 = new Card(CardSuit.SPADES, CardValue.ACE);
    card2 = new Card(CardSuit.HEARTS, CardValue.TEN);
    card3 = new Card(CardSuit.CLUBS, CardValue.TWO);
    card4 = new Card(CardSuit.DIAMONDS, CardValue.QUEEN);
    deck = new Deck();
    deck2 = new Deck();
    
   
  }

 

  @Test
  public void testDeckStartsEmpty(){
    assertEquals(0, deck.size());
  }

  @Test 
  public void buildDeckCreatesStandardDeck(){
    deck.buildDeck();
    assertEquals(52, deck.size());
  }

  @Test
  public void canAddToDeck(){
    deck.addToDeck(card1);
    assertEquals(1, deck.size());
  }

  @Test
  public void canDealCard(){
    deck.addToDeck(card1);
    assertEquals(card1, deck.dealCard());
  }

  @Test
  public void dealCardToAllPlayers(){
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(player1);
    players.add(player2);
    deck.buildDeck();
    deck.dealCardToAllPlayers(players);
    assertEquals(1, player1.getHand().cardsInHand());


  }

 

}