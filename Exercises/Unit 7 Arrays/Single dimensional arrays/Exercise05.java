import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[10];
    int min = 0;
    int max = 0;
    
    System.out.println("Enter 10 numbers: ");
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    min = numbers[0];
    max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      
      if (min > numbers[i]) {
        min = numbers[i];
      }
      
      if (max < numbers[i]) {
        max = numbers[i];      
      }
    }
    
    System.out.println();
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]);
      if (numbers[i] == min) {
        System.out.println(" minimum");
      } else if (numbers[i] == max) {
        System.out.println(" maximum");
      } else {
        System.out.println();
      }
    }

  }
}
