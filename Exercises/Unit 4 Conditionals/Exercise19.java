import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int number = sc.nextInt();
    int numberOfDigits = 0;
    
    if ((number >= 0) && (number <= 9) || (number <= 0) && (number >= -9)) {
      numberOfDigits = 1;
    }
    
    if ((number >= 10) && (number <= 99) || (number <= -10) && (number >= -99)) {
      numberOfDigits = 2;
    }
    
    if ((number >= 100) && (number <= 999) || (number <= -100) && (number >= -999)) {
      numberOfDigits = 3;
    }
    
    if ((number >= 1000) && (number <= 9999) || (number <= -1000) && (number >= -9999)) {
      numberOfDigits = 4;
    }
    
    if ((number >= 10000) && (number <= 99999) || (number <= -10000) && (number >= -99999)) {
      numberOfDigits = 5;
    }
    
    if ((number >= 100000) || (number <= -100000)) {
      System.out.println("Number too long remember to enter a maximum of 5 digits");
    } else {
      System.out.println("The number " + number + " has " + numberOfDigits + " digits");
    }
  }
}
