import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a desired height for the pyramid");
    int height = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter a character to draw the pyramid");
    String c = sc.nextLine();
 
    
    for (int i = 1; i <= height; i++) {
      
      for (int j = i; j <= height; j++ ) {
        System.out.print(" ");
      }
      
      for (int k = 1; k < i * 2; k++) {
        System.out.print(c);
      }
       
      System.out.println();
        
    }
    
    
  }
}
  
