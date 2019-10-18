import java.util.Scanner;

public class Exercise18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 2 numbers (they must be different)");
    System.out.println("Number 1: ");
    int number1 = sc.nextInt();
    System.out.println("Number 2: ");
    int number2 = sc.nextInt();
    
    while (number1 == number2) {
      System.out.println("Error... the two numbers are equal try again");
      System.out.println("Number 1: ");
      number1 = sc.nextInt();
      System.out.println("Number 2: ");
      number2 = sc.nextInt();
    }
    
    if (number1 < number2) {
      
      for (int i = number1; i <= number2; i += 7) {
        System.out.print(i + " ");
      }
      
    } else {
      
      for (int i = number2; i <= number1; i += 7) {
        System.out.print(i + " ");
      }
    }
    
    
  }
}
