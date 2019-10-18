import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a base and a positive exponent");
    
    System.out.println("Base: ");
    int base = sc.nextInt();
    
    System.out.println("Exponent: ");
    int exponent = sc.nextInt();
    
    if (exponent < 0) {
      System.out.println("Negative exponent not allowed");
    } else {
      System.out.println(base + " to the power of " + exponent + " = " + Math.pow(base, exponent));
    }
  }
}
