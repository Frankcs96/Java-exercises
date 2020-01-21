import java.util.Scanner;

public class Exercise26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the width of the nougat bar");
    int width = sc.nextInt();
    System.out.println("Enter the height of the nougat bar");
    int height = sc.nextInt();
    int randomWidth = (int)(Math.random() * ((width - 1) + 1)) + 1;
    int randomHeight = (int)(Math.random() * ((height - 1) + 1)) + 1;
    int randomPosition = (int)(Math.random() * ((4 - 1) + 1)) + 1;
    boolean isLeft = false;
    boolean isRight = false;
    boolean isUp = false;
    boolean isDown = false;
    
    switch (randomPosition) {
      case 1:
        isLeft = true;  
        break;
      case 2:
        isRight = true;  
        break;
      case 3:
        isUp = true;  
        break;
      case 4:
        isDown = true;  
        break;

      default:
     
    }
    
    for (int i = 1; i <= height; i++) {
      

      for (int j = 1; j <= width; j++) {
        if (isLeft && i == randomHeight && j == 1) {
          System.out.print(" ");
        } else if (isRight && i == randomHeight && j == width) {
          System.out.print(" ");
        } else if (isUp && i == 1 && j == randomWidth) {
          System.out.print(" ");
        } else if (isDown && i == height && j == randomWidth) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
         
        
        
      }
     
      System.out.println();
    }
  }
}
