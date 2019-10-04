import java.util.Scanner;

public class Exercise23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter numbers. the program will finish when the sum of the numbers is greater than 10000");
    int sum = 0;
    int numbCounter = 0;
    
    while (sum <= 10000) {
      int number = sc.nextInt();
      sum += number;
      numbCounter++;
      
    }
    
    System.out.println("Total: " + sum);
    System.out.println("you entered " + numbCounter + " numbers.");
    System.out.println("Average: " + sum / numbCounter );
    
    
    
    
  }
}
