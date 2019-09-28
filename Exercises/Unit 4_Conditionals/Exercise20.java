import java.util.Scanner;

public class Exercise20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
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
      if ((number % 10) == (number / 1000) && ) {
        isPalindromic = true; 
      }
    }

    
  }
}
