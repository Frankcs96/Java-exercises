import java.util.Scanner;

public class Exercise31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the L: ");
    int height = sc.nextInt();
    
    for (int i = 1; i <= height; i++) {
      
      for (int j = 0; j < 1; j++) {
        System.out.print("*");
               
      }
      
      for (int k = 1; k < height / 2 + 1; k++) {
        if (i == height) {
          System.out.print(" *");
          
        }
      }      
      System.out.println();
    }
      
       
  }
}
