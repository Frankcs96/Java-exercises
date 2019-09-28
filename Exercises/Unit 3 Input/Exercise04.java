import java.util.Scanner;


public class Exercise04 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert a number");
    double number1 = sc.nextDouble();
    
    System.out.println("Insert another number");
    double number2 = sc.nextDouble();
    
    System.out.println("The sum of the two numbers is " + (number1 + number2));
    System.out.println("The subtraction of the two numbers is " + (number1 - number2));
    System.out.println("The multiplication of the two numbers is " + (number1 * number2));
    System.out.println("The division of the two numbers is " + (number1 / number2));
  }
}

