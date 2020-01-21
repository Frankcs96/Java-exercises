import java.util.Scanner;

public class Exercise46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int width = 0;
    int height = 0;
    
    do {
    System.out.print("Please, enter the width of the rectangle (minimum 2): ");
    width = sc.nextInt();
    
    System.out.print("now enter the height of the rectangle (minimum 2): ");
    height = sc.nextInt();
    
    if ((width < 2) || (height < 2)) {
      System.out.println("Wrong input... minimum value for height/width is 2");
      System.out.println("---------------------------------------------------");
    }
    
    } while ((width < 2) || (height < 2));
    
    for (int i = 1; i <= height; i++) {
      
      for (int j = 1; j <= width; j++) {
        if (j == width || j == 1 || i == 1 || i == height) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        
      }
      
      System.out.println();
    }
    
    
  }
}
