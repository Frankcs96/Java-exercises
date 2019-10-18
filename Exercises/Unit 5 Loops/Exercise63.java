import java.util.Scanner;

public class Exercise63 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the height of the first pyramid: ");
    int height1 = sc.nextInt();
    System.out.print("Enter the height of the second pyramid: ");
    int height2 = sc.nextInt();
    int height = Math.max(height1, height2);
    
    
    for (int i = height; i > 0; i--) {
      
      if (i > height1) {
        for (int j = 0; j < height1 * 2 -1; j++) {
          System.out.print(" ");
          
        }
      } else {
        
        for (int j = 1; j < i; j++) {
          System.out.print(" ");
          
        }
        
        for (int j = 0; j <= (height1 - i) * 2 ; j++) { 
        System.out.print("*");
                
          
        }
        
        for (int j = 1; j < i; j++) {
          System.out.print(" ");
          
        }
          
        
      }
      
      
      
      
      if (i > height2) {
        
        for (int j = 0; j < height2 * 2 -1; j++) { 
          System.out.print(" ");
          
        
        }
        
      } else {
        
        for (int j = 0; j < i; j++) {
          System.out.print(" ");
          
          
        }
        
        
        
        
        
        for (int j = 0; j <= (height2 - i) * 2 ; j++) { 
          System.out.print("*"); 
        
        
          
          
        }
        
        
        
      }
      
      
      
      
      
        
      
      System.out.println();
    }
        
        
         
      
    
  }
}
