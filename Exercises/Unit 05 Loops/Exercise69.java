import java.util.Scanner;

public class Exercise69 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the mayan pyramid: ");
    int height = sc.nextInt();
    
    
    for (int i = 0; i < height; i++) {
      
      for (int j = 1; j < height - i; j++) {
        
        System.out.print(" ");
      }
      
      for (int j = 0; j < i * 2 + 6; j++) {
        if (i % 2 != 0) {
          if (j > i && j - i < 5) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        } else {
          System.out.print("*");
        }
        
      }
      
      
      System.out.println();
    }
  }
}
