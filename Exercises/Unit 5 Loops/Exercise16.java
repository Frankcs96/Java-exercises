import java.util.Scanner;

public class Exercise16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number and the program will check if it is a prime number.");
    int number = sc.nextInt();
    boolean isPrime = true;
    
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrime = false;
      }
    }
    
    if (isPrime) {
      System.out.println(number + " is a prime number");
    } else {
      System.out.println(number + " is not a prime number");
    }
    
    
    
  }
}
