import java.util.HashMap;
import java.util.Scanner;

public class Exercise21 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap <String, String> habitat = new HashMap<>();
    HashMap <String, String> alimentacion = new HashMap<>();

    habitat.put("rana","En los trópicos y cerca de las zonas húmedas y acuáticas");
    habitat.put("salamandra","Ecosistemas húmedos");
    habitat.put("sapo","En cualquier sitio salvo el desierto y la Antártida");
    habitat.put("tritón","América y África");

    alimentacion.put("rana", "Larvas e insectos");
    alimentacion.put("salamandra", "Pequeños crustáceos e insectos");
    alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
    alimentacion.put("tritón", "Insectos");

    System.out.print("Introduzca el tipo de anfibio: ");
    String animal = sc.nextLine();
    if (habitat.containsKey(animal)) {
      System.out.println("Hábitat: " + habitat.get(animal));
      System.out.println("Alimentación: " + alimentacion.get(animal));
    } else {
      System.out.println("Ese tipo de anfibio no existe");
    }
  }
}
