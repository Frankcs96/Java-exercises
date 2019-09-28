import java.util.Scanner;


public class Exercise09 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("****Cone volume Calculator****");
    
    System.out.println("Insert height (cm)");
    double height = sc.nextDouble();
    System.out.println("Insert Radius (cm)");
    double radius = sc.nextDouble();
    
    double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius,2.0) * height;
    
    System.out.println("The volume of the cone is " + volume + "cm³");
    
    
    
    
    
  }
}

