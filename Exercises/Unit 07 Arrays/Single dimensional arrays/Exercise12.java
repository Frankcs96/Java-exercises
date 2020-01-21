import java.util.Scanner;

public class Exercise12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[10];
    System.out.println("Enter 10 numbers pressing enter");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.println("Original array:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("| index: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("| Value: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("|%4d ", numbers[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    int start;
    int end;
    do {
      System.out.print("\nEnter starting position: ");
      start = sc.nextInt();
      System.out.print("Enter final position: ");
      end = sc.nextInt();
      if (end < start) {
        System.out.print("Final position cannot be greater than starting position");
      } else if (start > 9 || start < 0 || end > 9 || end < 0) {
        System.out.println("Final and starting position must be between 0 and 9");
      }
    } while (end < start || start > 9 || start < 0 || end > 9 || end < 0);

    int movement = end - start;

    for (int i = 0; i < movement; i++) {
      for (int j = 0; j < numbers.length - 1; j++) {
        int temp = numbers[j + 1];
        numbers[j + 1] = numbers[0];
        numbers[0] = temp;

      }
    }

    System.out.println("Final array:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("| index: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("| Value: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("|%4d ", numbers[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
