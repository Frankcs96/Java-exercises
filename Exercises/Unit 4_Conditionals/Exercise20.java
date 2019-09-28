import java.util.Scanner;

public class Exercise20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("****Palindrome checker****");
    System.out.println("Enter a number (max 5 digits)");
  
    int number = sc.nextInt();
    boolean isPalindromic = false;
    
    if ((number >= 0) && (number <= 9)) {
      isPalindromic = true;
    }
    
    if ((number >= 10) && (number <= 99)) {
      
      if ((number % 10) == (number / 10)) {
        isPalindromic = true;
      }
    }
    
    if ((number >= 100) && (number <= 999)) {
      if ((number % 10) == (number / 100)) {
        isPalindromic = true;
      }
    }
    
    if ((number >= 1000) && (number <= 9999)) {
      if ((number % 10) == (number / 1000) && (number % 100 / 10) == (number % 1000 / 100)) {
        isPalindromic = true; 
      }
    }
    
    
    if ((number >= 10000) && (number <= 99999)) {
      if ((number % 10) == (number / 10000) && (number % 100 / 10) == (number % 10000 / 1000)) {
        isPalindromic = true;
      }
      
    }
    
    if (number >= 1000000) {
      System.out.println("Number too long remember to enter a maximum of 5 digits");
    } else {
      
      if (isPalindromic) {
        System.out.println("The number: " + number + " is a palindrome");
      } else {
        System.out.println("The number: " + number + " is not a palindrome");
      }
    }
    
    

    
  }
}
