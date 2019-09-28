import java.util.Scanner;

public class Exercise17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int number = sc.nextInt();
    int lastDigit = number % 10;
    
    System.out.println("The last digit of " + number + " is " + lastDigit);
    
  }
}
