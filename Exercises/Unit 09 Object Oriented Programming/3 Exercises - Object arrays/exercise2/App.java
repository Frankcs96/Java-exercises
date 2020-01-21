import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cat[] cats = new Cat[4];


    cats[0] = new Cat("Tyrion", "Black", "Bombay cat" , Sex.MALE);
    cats[1] = new Cat("Garfield", "Orange", "Angora Cat", Sex.MALE);
    cats[2] = new Cat("Lulu", "White", "Bengal cat" , Sex.FEMALE);
    cats[3] = new Cat("Federico", "White", "Common European cat" , Sex.FEMALE);

    for (Cat cat : cats) {
      System.out.println(cat);
    }

  }
}
