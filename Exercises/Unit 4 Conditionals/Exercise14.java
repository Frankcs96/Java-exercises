import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    
    if (number % 2 == 0) {
      System.out.print("Even and");
    } else {
      System.out.print("Odd and");
    }
    
    if (number % 5 == 0) {
      System.out.print(" Divisible by 5");
    } else {
      System.out.print(" Not divisible by 5");
    }
  }
}
