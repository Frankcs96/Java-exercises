import java.util.Scanner;

public class Exercise41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a positive integer: ");
    long number = sc.nextLong();
    int evenDigits = 0;
    int oddDigits = 0;
    
    System.out.print("the number " + number + " has ");
    while (number > 0) {
      if ((number % 10) % 2 == 0) {
        evenDigits++;
      } else {
        oddDigits++;
      }
      
      number /= 10;
    }
    
    System.out.print(evenDigits + " even digits and " + oddDigits + " odd digits.");
    
  }
}
