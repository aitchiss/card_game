import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Card card1;
  Card card2;
  Deck deck;
  Hand hand;

  @Before
  public void before(){
    card1 = new Card(CardSuit.SPADES, CardValue.ACE);
    card2 = new Card(CardSuit.HEARTS, CardValue.TEN);
    deck = new Deck();
   
  }

 

  @Test
  public void testDeckStartsEmpty(){
    assertEquals(0, deck.size());
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



}