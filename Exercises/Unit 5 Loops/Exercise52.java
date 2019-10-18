import java.util.Scanner;

public class Exercise52 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    long number = sc.nextLong();
    long newNumber = number;
    int digits = 0;
    int firstDigit = 0;
    long numberWithoutFirstDigit = 0;
    
    while (number > 0) {
      digits++;
      number /= 10;
    }
    firstDigit =   (int) (newNumber / Math.pow(10, digits - 1));
    numberWithoutFirstDigit = (long) (newNumber % Math.pow(10, digits - 1));
    number = numberWithoutFirstDigit * 10 + firstDigit;
    
    System.out.println("The result is: " + number);
  }
}
