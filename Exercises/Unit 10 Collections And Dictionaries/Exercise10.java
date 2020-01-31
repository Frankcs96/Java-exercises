import java.util.HashMap;
import java.util.Scanner;

public class Exercise10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> words = new HashMap<>();
    words.put("Árbol", "Tree");
    words.put("Perro", "Dog");
    words.put("Gato", "Cat");
    words.put("Ratón", "Mouse");
    words.put("Hamburguesa", "Burguer");
    words.put("Vaca", "Cow ");
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
    words.put("Guerra", "War");

    System.out.print("Enter a spanish word: ");
    String word = sc.nextLine();
    if (words.containsKey(word)) {
      System.out.print("Your word in english means: " + words.get(word));
    } else {
      System.out.println("Word " + word + " is not available on this dictionary");
    }


  }


}