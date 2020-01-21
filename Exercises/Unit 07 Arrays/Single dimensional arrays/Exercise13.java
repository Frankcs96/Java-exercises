import java.util.Scanner;

public class Exercise13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[100];
    int maximum = 0;
    int minimum = 500;
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * ((500 - 0) + 1)) + 0;
      System.out.print(numbers[i] + " ");
      if (numbers[i] > maximum) {
        maximum = numbers[i];
      }

      if (numbers[i] < minimum) {
        minimum = numbers[i];
      }

    }



    System.out.print("\nWhat do you want to highlight? (1 - minimum, 2 - maximum): ");
    int option = sc.nextInt();
    if (option == 1) {
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == minimum) {
          System.out.print("**" + numbers[i] + "**" + " ");
        } else {
          System.out.print(numbers[i] + " ");
        }
      }
    } else {
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == maximum) {
          System.out.print("**" + numbers[i] + "**" + " ");
        } else {
          System.out.print(numbers[i] + " ");
        }
      }
    }
  }
}
