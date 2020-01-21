import java.util.Scanner;

public class Exercise16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[20];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * ((400 - 0) + 1)) + 0;

    }

    for (int i : numbers) {
      System.out.print(i + " ");
    }

    System.out
        .print("\nWhich numbers do you want to highlight? ( 1-Multiples of 5, 2-multiples of 7): ");

    int option = sc.nextInt();

    if (option == 1) {
      for (int i : numbers) {
        if (i % 5 == 0) {
          System.out.print("[" + i + "]" + " ");
        } else {
          System.out.print(i + " ");
        }
      }
    }

    if (option == 2) {
      for (int i : numbers) {
        if (i % 7 == 0) {
          System.out.print("[" + i + "]" + " ");
        } else {
          System.out.print(i + " ");
        }
      }
    }
    
    if (option != 1 && option != 2) {
      System.out.println("Wrong input try again (1 or 2)");
    }
  }

}
