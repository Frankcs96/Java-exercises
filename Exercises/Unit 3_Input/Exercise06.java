import java.util.Scanner;


public class Exercise06 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("******Triangle area calculator******");
    System.out.println("Insert base (cm)");
    double base = sc.nextDouble();
    System.out.println("Insert height (cm)");
    double height = sc.nextDouble();
    
    double area = (base * height) / 2;
    
    
    System.out.println("Area of the triangle: " + area +" square centimetres");
  }
}

