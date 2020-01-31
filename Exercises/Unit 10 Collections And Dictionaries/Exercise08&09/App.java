import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {

  public static void main(String[] args) {
    ArrayList<Card> cards = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      Card cardToAdd = new Card();
      while (cards.contains(cardToAdd)) {
        cardToAdd = new Card();
      }

      cards.add(cardToAdd);
    }

    Collections.sort(cards, new Comparator<Card>() {
      @Override
      public int compare(Card o1, Card o2) {
        int value1 = o1.getSuit().compareTo(o2.getSuit());
        if (value1 == 0) {
          return o1.getNumber() - (o2.getNumber());
        }
        return value1;
      }
    });

    for (Card card : cards) {
      System.out.println(card);

    }

  }


}
