import java.util.Scanner;

public class Exercise54 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the figure: ");
    int height = sc.nextInt();
    
    for (int i = 0; i < height; i++) {      
      for (int j = height - i; j >= 1; j--) {
        if (i == 0 || j == 1 || j + i == height ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        
      } 
      System.out.println();
    }
  }
}
