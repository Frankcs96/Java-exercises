
public class Exercise01to14 {
  public static void main(String[] args) {
    if (maths.Main.isPalindrome(29)) {
      System.out.println("number 29 is palindrome");
    }
    
    if (maths.Main.isPalindrome(464)) {
      System.out.println("number 464 is palindrome");
    }
    
    if (maths.Main.isPrime(29)) {
      System.out.println("29 is prime");
    }
    
    if (maths.Main.isPrime(80)) {
      System.out.println("80 is prime");
    }
    
    System.out.println("Next prime number greater than 23 is " + maths.Main.nextPrime(23));
    System.out.println("Next prime number greater than 100 is " + maths.Main.nextPrime(100));
  }
}
