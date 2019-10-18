import java.util.Scanner;

public class Exercise29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Displaying all numbers smaller than X and not divisible by Y. ");
    System.out.println("Enter X: ");
    int x = sc.nextInt();
    System.out.println("Enter Y: ");
    int y = sc.nextInt();
    
    while (x < 0 || y < 0) {
      System.out.println("Only positive numbers allowed. Try again");
      System.out.println("Enter X: ");
      x = sc.nextInt();
      System.out.println("Enter Y: ");
      y = sc.nextInt();
    }
    
    System.out.println("Numbers smaller than " + x + " and not divisible by " + y + ": ");
    
    for (int i = 0; i < x; i++) {
      if (i % y != 0)
      System.out.print(i +" ");
    }
    
    
    
  }
}
