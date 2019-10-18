import java.util.Scanner;

public class Exercise39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int factorial = 1;
    int number = 0;
    
    do {
      System.out.print("Please, enter a positive number: ");
      number = sc.nextInt();
      
      if (number < 0) {
        System.out.println("Negative numbers not allowed");
      }
    } while (number < 0);
    
    
    
    for (int i = 0; i < number; i++) {
      factorial *= i + 1;
      
      System.out.println(i + 1 + "! = " + factorial);
      
    }
    
  }
}
