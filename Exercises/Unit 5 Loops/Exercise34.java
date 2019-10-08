import java.util.Scanner;

public class Exercise34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long reversed1 = 0;
    long reversed2 = 0;
    String evenDigits = "";
    String oddDigits = "";
    
    System.out.println("Please, enter a number");
    long number1 = sc.nextLong();
    System.out.println("Please, enter another number");
    long number2 = sc.nextLong();
    
    while (number1 > 0 && number2 > 0) {
      reversed1 = (reversed1 * 10) + (number1 % 10); 
      reversed2 = (reversed2 * 10) + (number2 % 10);
      number1 /= 10;
      number2 /= 10;
    }
    
    while (reversed1 > 0 && reversed2 > 0) {
      if (reversed1 % 10 % 2 == 0) {
        evenDigits += reversed1 % 10;
      } else {
        oddDigits += reversed1 % 10;
      }
      
      if (reversed2 % 10 % 2 == 0) {
        evenDigits += reversed2 % 10;
      } else {
        oddDigits += reversed2 % 10;
      }
      
      reversed1 /= 10;
      reversed2 /= 10;
    }
    
    System.out.println("New number with even digits is " + evenDigits);
    System.out.println("New number with odd digits is " + oddDigits);
    
  }
}
