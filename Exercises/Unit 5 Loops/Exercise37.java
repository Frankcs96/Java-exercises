import java.util.Scanner;

public class Exercise37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    long number = 0;
    long reversed = 0;
    
    do {
      System.out.println("Please , enter a positive number");
      number = sc.nextLong();
      if (number < 0) {
        System.out.println("Wrong input...");
      }
      
    } while (number < 0);
    
    System.out.print("Number " + number + " is ");
    
    while (number > 0) {
      reversed = (reversed * 10) + (number % 10);
      number /= 10;
    }
    
    
    while (reversed > 0) {
      for (int i = 1; i <= reversed % 10; i++) {
        System.out.print("|");
        
      }
      reversed /= 10;
      if (reversed > 0) {
        System.out.print("-");
      }
      
    }
    
    System.out.print(" in sticks system");
    
  }
}
