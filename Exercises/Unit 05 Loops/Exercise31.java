import java.util.Scanner;

public class Exercise31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the L: ");
    int height = sc.nextInt();
    
    for (int i = 1; i < height; i++) {
      
      System.out.println("*");
    }
      
    for (int k = 1; k <= height / 2 + 1; k++) {
      System.out.print("* ");    
    }      
      
    
      
       
  }
}
