import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cat[] cats = new Cat[4];

    for (int i = 0; i < cats.length; i++) {
      System.out.println("**** Cat " + (i + 1) + " ****");
      System.out.print("Enter cat's name: ");
      String name = sc.nextLine();
      System.out.print("Enter cat's color: ");
      String color = sc.nextLine();
      System.out.print("Enter cat's breed: ");
      String breed = sc.nextLine();
      System.out.print("Choose an option: 1 Male 2 Female ");
      int option = sc.nextInt();
      sc.nextLine();
      if (option == 1) {
        cats[i] = new Cat(name, color, breed, Sex.MALE);
      } else {
        cats[i] = new Cat(name, color, breed, Sex.FEMALE);
      }
    }

    for (Cat cat : cats) {
      System.out.println(cat);
    }

  }
}
