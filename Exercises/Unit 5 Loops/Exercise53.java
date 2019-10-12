import java.util.Scanner;

public class Exercise53 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the height of the figure: ");
    int height = sc.nextInt();
    
    for (int i = 0; i < height; i++) {      
      for (int j = height - i; j >= 1; j--) {
        System.out.print("*");
      } 
      System.out.println();
    }
  }
}
