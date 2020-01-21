import java.util.Scanner;

public class Exercise17 { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("****Binary to decimal converter****");
    System.out.print("Enter a binary number: ");
    long number = sc.nextLong();
    System.out.print("Number " + number + " converted to decimal is " + binaryToDecimal(number));
    
    
  }
  
  
  public static int binaryToDecimal (long n) {
    
    int bits = maths.Main.getDigits(n);
    int result = 0;
    for (int i = 0; i < bits; i++) {
      if (n % 10 == 1) {
        result += maths.Main.power(2, i);
      }
      n /= 10;
    }
    
    return result;
  }
}
