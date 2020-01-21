import java.util.Scanner;

public class Exercise27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int number = sc.nextInt();
    int counter = 0;
    int sum = 0;
    System.out.println("Multiples of 3 between 3 and " + number + ": ");
    
    
    for (int i = 1; i < number; i++) {
      
      if (i % 3 == 0) {
        System.out.print(i + " ");
        
        counter++;
        sum += i;
      }
      
      
    }
    
    System.out.println("\nTotal of numbers: " + counter);
    System.out.println("Sum: " + sum);
    
    
    
  }
}
