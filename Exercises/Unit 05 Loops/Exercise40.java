import java.util.Scanner;

public class Exercise40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 0;  
    
    do {
      System.out.println("Please enter the height of the diamond: ");
      System.out.println("remember it has to be an odd number and >= 3");
      height = sc.nextInt();
      if ((height < 3) || (height % 2 == 0)) {
        System.out.println("Wrong input.... try again");
      }
      
    } while (height < 3 || height % 2 == 0);
    
    
    for (int i = 0; i < height / 2 + 1; i++) {
      
      for (int j = height / 2; j > i ; j--) {
        System.out.print(" ");
      }
      
      for (int j = 0; j <= i*2; j++) {
        
        if (i + j == 0 || i + j == i || j-i == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        
        
      }
      
      
      
      System.out.println();
    }
    
    for (int i = 0; i < height / 2; i++) { // 0 1 2
      
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      
      for (int j = height - 2; j > i*2 ; j--) {
        if ( j - i == 1 + i || i + j-i == height - 2) { 
          
          System.out.print("*");
          
          
        } else {
          System.out.print(" ");
          
          
        }
        
      }
      
      
      
      
      System.out.println();
    }
    
  }
  
}
