import java.util.Scanner;

public class Exercise64 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 3;
    int width = 6;
    int userOption = 0;
    
    do {
      for (int i = 0; i < height; i++) {
        
        for (int j = 0; j < width ; j++) {
          if (j == 0 || i == 0 || i == height - 1 || j == width - 1) {
            System.out.print("*");
            
          } else {
            System.out.print(" ");
          }
         
        }
        
        System.out.println();
      }
      
      System.out.println("1. Bigger");
      System.out.println("2. Smaller");
      System.out.println("3. Rotate");
      System.out.println("4. Exit");
      System.out.print("What do you want to do with the rectangle: ");
      userOption = sc.nextInt();
      
      switch (userOption) {
        case 1:
          height++;
          width++;
          break;
          
        case 2:
          if (height > 2 && width > 2) {
            height--;
            width--;
          } else {
            System.out.println("It Cannot be smaller");
          }
          break;
        case 3:
          int temp = 0;
          temp = width;
          width = height;
          height = temp;
          break;
        case 4:
          System.out.println("Have a good day!");
          break;

      default:
        System.out.println("Wrong input...");
      }
      
      
    } while (userOption != 4);
    
  }
}
