import java.util.Scanner;

public class Exercise50 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("****155 poster printer****");
    int height = 0;
    int spaces = 0;
    do {
      System.out.println("Enter height (minimum 5): ");
      height = sc.nextInt();
      
      System.out.println("Enter spaces between numbers (minimum 1): ");
      spaces = sc.nextInt();
      
      if (height < 5 || spaces < 1) {
        System.out.println("Wrong input.. try again");
        System.out.println("-----------------------------");
      }
      
    } while (height < 5 || spaces < 1);
    
    for (int i = 1; i <= height; i++) {
      System.out.print("*");
      if (i == 1 || i == 3 || i == height) {
        for (int j = 1; j <= spaces; j++) {
          System.out.print(" ");
        }
        
        System.out.print("****");
        for (int j = 1; j <= spaces; j++) {
          System.out.print(" ");
        }
        
        System.out.print("****");
      }
      
      if (i == 2) {
        for (int j = 1; j <= spaces; j++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        
        for (int j = 1; j <= spaces + 3; j++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        
      }
      
      if (i > 3 && i < height) {
        
        for (int j = 1; j <= spaces + 3; j++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        
        for (int j = 1; j <= spaces + 3; j++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        
        
      }
      
      System.out.println();
    }
    

  }

}
