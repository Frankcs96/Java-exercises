import java.util.Scanner;

public class Exercise15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] table = new int[10];
    boolean running = true;

    for (int i = 0; i < table.length; i++) {
      table[i] = (int) (Math.random() * 5);
    }

    int people;
    boolean groupIsSit;
    while (running) {

      System.out.println(
          "\n┌─────────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
      System.out.print("|Table nº ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d   ", i);
      }
      System.out.println(
          "│\n├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
      System.out.print("|Ocupation");
      for (int t : table) {
        System.out.printf("│  %d   ", t);
      }
      System.out.println(
          "│\n└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");


      groupIsSit = false;
      System.out.print("How many of you are? (Enter -1 to exit): ");
      people = sc.nextInt();

      if (people == -1) {
        System.out.println("Have a nice day");
        running = false;
        groupIsSit = true;
      }

      if (people > 4) {
        System.out
            .println("Sorry we can`t allow groups of " + people + " make groups of 4 people.");
        groupIsSit = true;
      }

      for (int i = 0; i < table.length; i++) {
        if (table[i] == 0 && groupIsSit == false) {
          System.out.println("Please, take a seat in table number " + (i + 1));
          table[i] = people;
          groupIsSit = true;
        }

      }

      for (int i = 0; i < table.length; i++) {
        if (table[i] + people <= 4 && groupIsSit == false) {
          System.out
              .println("You have to share table, Please take a seat in table number " + (i + 1));
          table[i] += people;
          groupIsSit = true;
        }
      }

      for (int i = 0; i < table.length; i++) {
        if (table[i] + people > 4 && groupIsSit == false) {
          System.out.println("Sorry, we are full");
          groupIsSit = true;
        }
      }
    }
  }
}
