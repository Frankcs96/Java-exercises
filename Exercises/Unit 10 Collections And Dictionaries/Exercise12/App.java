import java.util.ArrayList;
import java.util.HashMap;

public class App {

  public static void main(String[] args) {
    int score = 0;
    HashMap<Integer, Integer> values = new HashMap<>();
    values.put(1, 11);
    values.put(3, 10);
    values.put(10, 2);
    values.put(11, 3);
    values.put(12, 4);

    ArrayList<Card> cards = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      Card cardToAdd = new Card();
      while (cards.contains(cardToAdd)) {
        cardToAdd = new Card();
      }
      if (values.containsKey(cardToAdd.getNumber())) {
        score += values.get(cardToAdd.getNumber());
      }
      cards.add(cardToAdd);
    }

    for (Card card : cards) {
      System.out.println(card);
    }
    System.out.println("Your score is: " + score);


  }

}