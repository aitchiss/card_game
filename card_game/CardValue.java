package card_game;

public enum CardValue{
  ACE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13);

  private int numberValue;

  CardValue(int numberValue){
    this.numberValue = numberValue;
  }

  public int cardValue(){
    return this.numberValue;
  }

  public String valueName(){
    return name().toLowerCase();
  }
}