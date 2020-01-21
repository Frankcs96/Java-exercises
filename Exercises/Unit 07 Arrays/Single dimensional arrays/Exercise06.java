import java.util.Scanner;

public class Exercise06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[15];

    System.out.println("Enter 15 numbers pressing [ENTER]: ");

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();

    }
    
    System.out.println("Original array: ");
    
    
    for (int n : numbers) {
      System.out.print(n + ", ");
    }

    for (int i = 0; i < numbers.length - 1; i++) {
      int temp = numbers[0];
      numbers[0] = numbers [i + 1];
      numbers [i + 1] = temp;
      
      
    }
    
    System.out.println("\nArray moved one position right");
    for (int n : numbers) {
      System.out.print(n + ", ");
    }

  }
}
