import java.util.Scanner;

public class Exercise66 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 0;
    System.out.print("Please, enter the height of the figure: ");
    
    do {
      
      height = sc.nextInt();
      
      if (height < 3 || height % 2 == 0) {
        System.out.println("Wrong input... height must be odd and greater or equal to 3");
        
      }
      
    } while (height < 3 || height % 2 == 0);
    
    
    for (int i = 0; i < height; i++) {
      if (i < height / 2 + 1) {
        
        for (int j = 0; j < i; j++) {
          
          System.out.print(" ");
          
        }
        System.out.print("*    *");
      } else {
        
        for (int j = i; j < height - 1; j++) {
          
          System.out.print(" ");
          
        }
        
        System.out.print("*    *");
      }
      
      
      
      
      
      
      System.out.println();
    }
    
    
    
  }
}
