import java.util.Scanner;

public class Exercise03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[10];

    System.out.println("Enter 10 numbers");

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Number " + (i + 1) + ": ");
      numbers[i] = sc.nextInt();
    }

    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.print(numbers[i] + ", ");
    }
    
    
  }


}
