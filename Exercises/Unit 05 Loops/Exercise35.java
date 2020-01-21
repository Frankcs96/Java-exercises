import java.util.Scanner;

public class Exercise35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 0;  
    
    do {
      System.out.println("Please enter the height of the X: ");
      System.out.println("remember it has to be an odd number and >= 3");
      height = sc.nextInt();
      if ((height < 3) || (height % 2 == 0)) {
        System.out.println("Wrong input.... try again");
      }
      
    } while (height < 3 || height % 2 == 0);
    
    for (int i = 1; i <= height; i++) {
      
      for (int j = 1; j <= height; j++) {
        
        if (i == j || i + j == height + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }             
      }
      
      System.out.println(" ");
    }
    
  }
}
