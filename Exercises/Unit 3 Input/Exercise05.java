import java.util.Scanner;


public class Exercise05 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("******Rectangle area calculator******");
    System.out.println("Insert width (cm)");
    double width = sc.nextDouble();
    System.out.println("Insert height (cm)");
    double height = sc.nextDouble();
    
    double area = width * height;
    
    
    System.out.println("Area of the rectangle: " + area +" square centimetres");
  }
}

