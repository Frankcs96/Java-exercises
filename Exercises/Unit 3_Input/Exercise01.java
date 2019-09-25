import java.util.Scanner;


public class Exercise01 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    
    double number1 = sc.nextDouble();
    
    System.out.println("Enter another number");
    
    double number2 = sc.nextDouble();
    
    double mult = number1 * number2;
    
    System.out.println("The multiplication of the two numbers is " + mult); 
  }
}

