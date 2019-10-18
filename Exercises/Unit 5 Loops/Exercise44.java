import java.util.Scanner;

public class Exercise44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please, enter a positive integer: ");
    long number = sc.nextLong();
    
    System.out.print("Enter the position where you want to insert a digit: ");
    int position = sc.nextInt();
    
    System.out.print("Enter the digit that you want to insert: ");
    int digit = sc.nextInt();
    
    long reversed = 0;
    long newNumber = 0;
    
    while (number > 0) {
      reversed = (reversed * 10) + (number % 10);
      number /= 10;    
    }
    
    while (reversed > 0) {
      
      if (position == 1) {
        newNumber = (newNumber * 10) + digit;
      } else {
        newNumber = (newNumber * 10) + (reversed % 10);
        reversed /= 10;
      }
      
      position--;
      
      
    }
    
    System.out.println("The new number is: " + newNumber);
  }
}
