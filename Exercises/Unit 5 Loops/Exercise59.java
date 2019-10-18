import java.util.Scanner;

public class Exercise59 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter the height of the X-mas tree (minimum 4)");
    int height = 0;
    do {
      height = sc.nextInt();
      if (height < 4) {
        System.out.println("Wrong input... try again");
      }
    } while (height < 4);
    
    
    for (int i = 0; i < height; i++) {
      
      if (i == 0) {
        for (int j = i; j < height - 3; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      
      for (int j = i; j < height - 2; j++) {
        System.out.print(" ");
  
      }
      
      
      if (i > 0 && i < height - 1) {
        
        for (int j = height -1 -i * 2; j < height - 2; j++) {
          
          if (i == height - 2 || i == 1 || j == height - 3 || i * 2 + j == height - 1 ) {
            System.out.print("^");
          } else {
            System.out.print(" ");
          }
          
        }
        
      }
      
      if (i == height - 1) {
        for (int j = 0; j < height - 3; j++) {
          System.out.print(" ");
    
        }
        
        System.out.print("Y");
      }
              
      System.out.println(); 
    }
    
  }
}
