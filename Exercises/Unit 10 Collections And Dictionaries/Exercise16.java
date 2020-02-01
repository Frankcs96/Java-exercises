import java.util.HashMap;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> countries = new HashMap<>();
    countries.put("España", "Madrid");
    countries.put("Portugal", "Lisboa");
    countries.put("Francia", "París");

    while (running) {

      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      String country = sc.nextLine();
      if (country.equals("salir")) {
        running = false;
      } else {
        if (countries.containsKey(country)) {
          System.out.println("La capital de " + country + " es " + countries.get(country));
        } else {
          System.out.print("No conozco la respuesta ¿cuál es la capital de " + country + "?: ");
          String newCapital = sc.nextLine();
          countries.put(country, newCapital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }


    }

  }
}
