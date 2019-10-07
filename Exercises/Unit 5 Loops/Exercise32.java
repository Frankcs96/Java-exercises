import java.util.Scanner;

public class Exercise32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a positive number to get the sum of even digits");
    System.out.println("and their position from left to right: ");
    long number = sc.nextLong(); // 4523
    long reversed = 0;
    int sum = 0;
    
    while (number > 0) {
      reversed = reversed * 10 + number % 10;
      
      number /= 10;
    }
    
    System.out.print("Even digits: ");
    
    while (reversed > 0) {
      long digit = reversed % 10;
      if (digit % 2 == 0) {
        System.out.print(digit + " ");
        sum += digit;
      }
      
      reversed /= 10;
    }
    
    System.out.println("\nSum of the even digits: " + sum);
    
  }
}
