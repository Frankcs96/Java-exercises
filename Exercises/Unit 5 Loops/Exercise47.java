
import java.util.Scanner;

public class Exercise47 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int width = 6;
    int height = 0;
    
    do { 
    System.out.print("Please enter the height of the 8 figure (odd number >= 5): ");
    height = sc.nextInt();
    
    if ((height < 5) || (height % 2 == 0)) {
      System.out.println("Wrong height...");
      System.out.println("---------------------------------------------------");
    }
    
    } while ((height < 5) || (height % 2 == 0));
    
    for (int i = 1; i <= height; i++) {
      
      for (int j = 1; j <= width; j++) {
        if (j == width || j == 1 || i == 1 || i == height || i == height / 2 + 1) {
          System.out.print("M");
        } else {
          System.out.print(" ");
        }
        
      }
      
      System.out.println();
    }
    
    
  }
}
