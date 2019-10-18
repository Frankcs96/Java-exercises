import java.util.Scanner;

public class Exercise61 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter the height of the V (minimum 3)");
    int height = 0;
    do {
      height = sc.nextInt();
      if (height < 3) {
        System.out.println("Wrong input... try again");
      }
    } while (height < 3);
    
    for (int i = 0; i < height; i++) {
      
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      
      
      if (i == height - 1) {
        System.out.print("******");
      } else {
        System.out.print("***");
      }
      
      
      for (int j = 0; j < height - i; j++) {
        System.out.print(" ");
      }
      
      for (int j = i; j < height - 2; j++) {
        System.out.print(" ");
      }
      
      if (i < height - 1) {
        System.out.print("***");
      }
      
      
      
      
      System.out.println();
      
    }
    
    
    
  }
  
}
    