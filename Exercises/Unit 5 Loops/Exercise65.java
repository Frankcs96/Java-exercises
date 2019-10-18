import java.util.Scanner;

public class Exercise65 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 0;
    int stickRow = 0;
    boolean isCorrect = false;
    
    System.out.print("Enter the height of the A (number greater or equal than 3): ");
    height = sc.nextInt();
    if (height < 3) {
      System.out.println("Wrong height....");
    } else {
      System.out.print("Enter the row for the horizontal stick"
          + " (between 2 and " + (height - 1) + "): ");
      
      stickRow = sc.nextInt();
      
      if (stickRow < 2 || stickRow > height - 1) {
        System.out.println("Wrong row....");
      } else {
        isCorrect = true;
      }
    }
    
    if (isCorrect) {
      
      for (int i = 0; i < height; i++) {
        
        for (int j = 1; j < height - i; j++) {
          System.out.print(" ");
          
        }
        
        for (int j = 0; j <= i * 2; j++) {
          
          if(i == stickRow - 1 ||  j == 0 || j - i == i) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
          
          
        }
        
        System.out.println();
      }
      
      
      
      
      
      
      
    }
    
    
    
  }
  
  
  
}
