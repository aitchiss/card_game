import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest{

  Player player;

  @Before
  public void before(){
    player = new Player("Computer");
  }

  @Test
  public void playerHasName(){
    assertEquals("Computer", player.getName());
  }

}