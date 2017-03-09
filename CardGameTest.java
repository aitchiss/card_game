import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardGameTest{

  Card card1;
  Card card2;

  @Before
  public void before(){
    card1 = new Card(CardSuit.SPADES, CardValue.ACE);
    card2 = new Card(CardSuit.HEARTS, CardValue.TEN);
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

}