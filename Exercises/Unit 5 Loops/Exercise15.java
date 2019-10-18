import java.util.Scanner;

public class Exercise15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 1;
    
    System.out.println("Enter the base");
    double base = sc.nextDouble();
    
    System.out.println("Enter the exponent (only positive numbers)");
    int exponent = sc.nextInt();
    
    if (exponent >= 0) {
      
      for (int i = 1; i <= exponent; i++) {
        result *= base;
        System.out.println(base + "^" + i + " = " + result);
      }
    } else {
      System.out.println("Exponent must be positive");
    }
  }
}
