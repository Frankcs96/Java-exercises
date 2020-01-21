import java.util.Scanner;

public class Exercise68 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please, enter a number: ");
    long number = sc.nextLong();
    long print = number;
    long temp = 0;
    long dislocated = 0;
    
    while (number > 0) {
      int digit = (int) (number % 10);
      if (digit % 2 == 0) {
        digit++;
      } else {
        digit--;
      }
      temp = (temp * 10) + digit;
      number /= 10;
      
    }
    
    while (temp > 0) {
      dislocated = (dislocated * 10) + (temp % 10);
      temp /= 10;
    }
    
    System.out.println("The number " + print + " dislocated is " + dislocated );
    
    
    
  }
}
