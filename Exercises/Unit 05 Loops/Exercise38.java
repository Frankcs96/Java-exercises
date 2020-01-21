import java.util.Scanner;

public class Exercise38 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 0;  
    
    do {
      System.out.println("Please enter the height of the hourglass: ");
      System.out.println("remember it has to be an odd number and >= 3");
      height = sc.nextInt();
      if ((height < 3) || (height % 2 == 0)) {
        System.out.println("Wrong input.... try again");
      }
      
    } while (height < 3 || height % 2 == 0);
    
    for (int i = 0; i < height / 2 + 1; i++) {
      
      
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
        
      }
      
      for (int j = 1; j <= height - 2 * i; j++) {
        System.out.print("*");
        
        
      }
      
      System.out.println();
      
    }
    
    for (int i = 0; i < height / 2; i++) { // 0 1
      
      
      for (int k = height / 2 - 1; k > i; k--) {
        System.out.print(" ");
        
      }
      
      for (int j = 0; j <= 2 + i * 2; j++) { // 2 4    
        System.out.print("*");
        
        
      }
      
      System.out.println();
      
    }
    
    
    
  }
}


