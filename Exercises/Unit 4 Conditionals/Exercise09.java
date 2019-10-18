import java.util.Scanner;

public class Exercise09 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("***Quadratic equation solver (ax^2 + bx + c = 0)***");
    System.out.println("Enter value of a");
    double a = sc.nextDouble();
    System.out.println("Enter value of b");
    double b = sc.nextDouble();
    System.out.println("Enter value of c");
    double c = sc.nextDouble();
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("No solution.");
    }
    
    else if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Infinite solutions.");
    }
    
    else if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println(" only 1 solution x = " + (-c / b));
    }
    
    else {
        
      double discriminant = Math.pow(b,2) - (4 * a * c);
      
      if (discriminant < 0) {
          System.out.println("Equation has no real solutions");
      }
       
      else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminant))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminant))/(2 * a));
      }
    }
  }
}

