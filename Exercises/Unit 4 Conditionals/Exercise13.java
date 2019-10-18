import java.util.Scanner;

public class Exercise13 {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 3 numbers");
    
    System.out.println("Number 1: ");
    int number1 = sc.nextInt();
    
    System.out.println("Number 2: ");
    int number2 = sc.nextInt();
    
    System.out.println("Number 3: ");
    int number3 = sc.nextInt();
    
    System.out.println("Numbers in ascending order");
    
    if ((number1 < number2) && (number1 < number3)) {
      
      if (number2 < number3) {
        System.out.print(number1 + " " + number2 + " " + number3);
      } else {
        System.out.print(number1 + " " + number3 + " " + number2);
      }
      
    }
    
    if ((number2 < number1) && (number2 < number3)) {
      if ((number1 < number3)) {
        System.out.print(number2 + " " + number1 + " " + number3);
      } else {
        System.out.print(number2 + " " + number3 + " " + number1);
      }
      
    }
    
    if ((number3 < number1) && (number3 < number2)) {
      if ((number1 < number2)) {
        System.out.print(number3 + " " + number1 + " " + number2);
      } else {
        System.out.print(number3 + " " + number2 + " " + number1);
      }
    }

  }

}
