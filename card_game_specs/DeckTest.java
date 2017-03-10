import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

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