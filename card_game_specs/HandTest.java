import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest{

  Card card1;
  Card card2;
  Deck deck;
  Hand hand;

  @Before
  public void before(){
    card1 = new Card(CardSuit.SPADES, CardValue.ACE);
    card2 = new Card(CardSuit.HEARTS, CardValue.TEN);
    hand = new Hand();
  }

 
  @Test
  public void handStartsEmpty(){
    assertEquals(0, hand.cardsInHand());
  }

  @Test
  public void handCanAddCard(){
    hand.addToHand(card1);
    assertEquals(1, hand.cardsInHand());
  }

  @Test
  public void handCanRemoveCard(){
    hand.addToHand(card1);
    hand.removeCard();
    assertEquals(0, hand.cardsInHand());
  }

}