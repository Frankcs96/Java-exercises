import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("This program gives you the solution to an equation ax + b = 0");
    System.out.println("Enter the value of a: ");
    double a = sc.nextDouble();
    System.out.println("Enter the value of b: ");
    double b = sc.nextDouble();
    
    double solution = -b / a;
    if (a == 0) {
      System.out.println("This equation has no real solution");
    } else {
      System.out.println("x = " + solution);
    }                                               
    
  }
}
