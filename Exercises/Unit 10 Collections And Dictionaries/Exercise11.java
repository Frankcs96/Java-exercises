import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> words = new HashMap<>();
    words.put("Árbol", "Tree");
    words.put("Perro", "Dog");
    words.put("Gato", "Cat");
    words.put("Ratón", "Mouse");
    words.put("Hamburguesa", "Burguer");
    words.put("Vaca", "Cow");
    words.put("Burro", "Donkey");
    words.put("Cabra", "Goat");
    words.put("Conejo", "Rabbit");
    words.put("Oveja", "Sheep");
    words.put("Pavo", "Turkey");
    words.put("Buey", "Ox");
    words.put("Pato", "Duck");
    words.put("Toro", "Bull");
    words.put("Gallina", "Hen");
    words.put("Gallo", "Rooster");
    words.put("Caballo", "Horse");
    words.put("Yegua", "Mare");
    words.put("Arroz", "Rice");
    words.put("Judias", "Beans");


    ArrayList<String> keys = new ArrayList<>(words.keySet());
    System.out.println("Enter the translation to english of the following words");
    int score = 0;

    for (int i = 0; i < 5 ; i++) {
      String randomKey = keys.get((int)(Math.random() * ((19 - 0) + 1)) + 0);
      System.out.print(randomKey + ": ");
      String solution = sc.nextLine();
      if (solution.equalsIgnoreCase(words.get(randomKey))) {
        score++;
      }
      keys.remove(randomKey);
    }

    System.out.println("Your score is: " + score);
  }


}