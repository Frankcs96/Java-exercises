import java.util.Scanner;

public class Exercise57 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the figure: ");
    int height = sc.nextInt();
    
    for (int i = 0; i < height; i++) {
      
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      
      for (int j = 0; j < height - i; j++) {
        if (i == 0 || j == 0 || j + i == height - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        
      }
      
      System.out.println();
    }
  }
}
