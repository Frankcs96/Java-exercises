import java.util.Scanner;

public class Exercise55 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter a number: ");
    long number = sc.nextLong();
    long temp = number;
    int digits = 0;
    int lastDigit = (int) (number % 10);
    
    while (number > 0) {
      digits ++;
      number /= 10;
    }
    
    number = (long) (lastDigit * Math.pow(10, digits - 1) + (temp / 10) % Math.pow(10, digits - 1));
    System.out.println("The result is " + number);
    
  }
}
