import java.util.Scanner;

public class Exercise33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the height of the U letter: ");
    int height = sc.nextInt();
    
    for (int i = 1; i < height; i++) {
      System.out.print("* ");
      for (int j = 1; j < height - 1; j++) {
        System.out.print("  ");
        
      }
        
        
      System.out.println("*");
      
    }
    
    System.out.print("  ");
    
    for (int k = 1; k < height - 1; k++) {
      System.out.print("* ");
      
      
    }
 
          
  }
}
