import java.util.Objects;

public class Card {

  private static String[] suits = {"Oros", "Copas", "Espadas", "Bastos"};
  private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
      12};
  private String suit;
  private int number;

  public Card() {
    this.suit = suits[(int) (Math.random() * ((3 - 0) + 1)) + 0];
    this.number = numbers[(int) (Math.random() * ((11 - 0) + 1)) + 0];
  }

  @Override
  public String toString() {
    String numberToString = this.number + "";
    if (this.number == 10) {
      numberToString = "Sota";
    }

    if (this.number == 11) {
      numberToString = "Caballo";
    }

    if (this.number == 12) {
      numberToString = "Rey";
    }
    return numberToString + " de " + this.suit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(suit, card.suit) &&
        Objects.equals(number, card.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suit, number);
  }

  public String getSuit() {
    return suit;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
