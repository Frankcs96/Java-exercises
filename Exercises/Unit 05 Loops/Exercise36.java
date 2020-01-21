import java.util.Scanner;

public class Exercise36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("****Palindrome checker****");
    
    System.out.println("Enter a number: ");
    long number = sc.nextLong();
    long notReversed = number;
    long reversed = 0;
    
    while (notReversed > 0) {
      reversed = (reversed * 10) + (notReversed % 10);
      
      notReversed /= 10;
    }
    
    if (number == reversed) {
      System.out.println("Number " + number + " is a palindrome");
    } else {
      System.out.println("Number " + number + " is not a palindrome");
      
    }
  }
}
