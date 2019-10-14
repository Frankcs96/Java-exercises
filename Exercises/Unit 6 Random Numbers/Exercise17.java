import java.util.Scanner;

public class Exercise17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the fish tank (min 4): ");
    int height = sc.nextInt();
    
    System.out.print("Enter the width of the fish tank (min 4): ");
    int width = sc.nextInt();
    
    int randomPositionI = (int)(Math.random() * (((height - 2) - 1) + 1)) + 1;
    int randomPositionJ = (int)(Math.random() * (((width - 2) - 1) + 1)) + 1;

    
    for (int i = 0; i < height; i++) {
    
      for (int j = 0; j < width; j++) {
        if (j == 0 || i == 0 || j == width - 1 || i == height - 1) {
          System.out.print("*");
          
        } else {
          if (i == randomPositionI && j == randomPositionJ) {
            System.out.print("&");
          } else {
            System.out.print(" ");
          }
          
        }
        
      }
      
      System.out.println();
    }
    
  }
}
