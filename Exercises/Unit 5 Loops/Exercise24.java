import java.util.Scanner;

public class Exercise24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of rows for our pyramid");
    int rows = sc.nextInt();
    
    
    for (int i = 1; i <= rows; i++) {
      
      for (int j = i; j < rows; j++) {
        System.out.print(" ");
        
      }
      
      for (int k = 1; k < i * 2; k++) {
        
        if (k > i) {
          System.out.print(2 * i - k);
          
          
        } else {
          System.out.print(k);
        }
        
      }
      
      
      
      System.out.println();
      
    }
  }
}

