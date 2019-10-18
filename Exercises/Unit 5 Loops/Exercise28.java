import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number to calculate the factorial (only positive numbers).");
    int number = sc.nextInt();
    int factorial = 1;
    
    while (number < 0) {
      System.out.println("Wrong input... only positive numbers. try again");
      number = sc.nextInt();
    }
    
    for (int i = 1; i <= number; i++) {
      factorial *= i;
      
      
    }
    
    System.out.println(number +"! = " + factorial);
    
  }
}
