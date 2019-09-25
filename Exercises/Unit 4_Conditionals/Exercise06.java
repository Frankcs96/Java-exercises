import java.util.Scanner;

public class Exercise06 {
	
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the height (m) in order to calculate the fall time");
    final double g = 9.81;
    double height = sc.nextDouble();
    
    double result = Math.sqrt(2*height/g);
    
    System.out.printf("Fall time: %.2f seconds",result);
    
  }
}

