import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardGameTest{

  Card card1;
  Card card2;
  Deck deck;

  @Before
  public void before(){
    card1 = new Card(CardSuit.SPADES, CardValue.ACE);
    card2 = new Card(CardSuit.HEARTS, CardValue.TEN);
    deck = new Deck();
  }

  @Test
  public void testCardHasSuit(){
    assertEquals(CardSuit.SPADES, card1.getSuit());
  }

  @Test
  public void testCardHasValue(){
    assertEquals(1, card1.getValue());
  }

  @Test
  public void testCardHasName(){
    assertEquals("ace", card1.getValueName());
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