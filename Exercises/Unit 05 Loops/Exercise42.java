import java.util.Scanner;

public class Exercise42 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please, enter a positive integer: ");
    int number = sc.nextInt();
    boolean isPrime = true;
    
    for (int i = number; i < number + 5; i++) {
      isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
        }     
        
      }
      
      if (isPrime) {
        System.out.println(i + " is prime");
      } else {
        System.out.println(i + " is not prime");
      }
      
    }
  }
}
