import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise20 {

  public static void main(String[] args) {
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> dictionary = new HashMap<>();
    dictionary.put("caliente", "hot");
    dictionary.put("rojo", "red");
    dictionary.put("ardiente", "hot");
    dictionary.put("verde", "green");
    dictionary.put("agujetas", "stiff");
    dictionary.put("abrasador", "hot");
    dictionary.put("hierro", "iron");
    dictionary.put("grande", "big");

    while (running) {
      System.out.print("Introduzca una palabra y le daré los sinónimos: ");
      String word = sc.nextLine();
      if (word.equals("salir")) {
        running = false;
      } else if (!dictionary.containsKey(word)) {
        System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
        if (sc.nextLine().equals("s")) {
          System.out.print("Introduzca la traducción de " + word + " en inglés: ");
          dictionary.put(word, sc.nextLine());
        }
      } else if (dictionary.containsKey(word)) {
        ArrayList<String> synonyms = new ArrayList<>();
        ArrayList<String> keys = new ArrayList<>(dictionary.keySet());
        String value = dictionary.get(word);
        for (String key : keys) {
          if (dictionary.get(key).equals(value) && !key.equals(word)) {
            synonyms.add(key);
          }
        }
        if (synonyms.size() == 0) {
          System.out.print("No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): ");
          if (sc.nextLine().equals("s")) {
            System.out.print("Introduzca un sinónimo de " + word + ": ");
            dictionary.put(sc.nextLine(), dictionary.get(word));
            System.out.println("Gracias por enseñarme nuevos sinónimos.");
          }
        } else {
          System.out.print("Sinónimos de " + word + ": ");
          for (int i = 0; i < synonyms.size(); i++) {
            if (i != synonyms.size() - 1) {
              System.out.print(synonyms.get(i) + ", ");
            } else {
              System.out.print(synonyms.get(i));
            }

          }
          System.out.println();
        }


      }

    }


  }
}
