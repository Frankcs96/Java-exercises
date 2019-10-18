import java.util.Scanner;

public class Exercise18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number (maximum 5 digits)");
    int number = sc.nextInt();
    int firstDigit = 0;
    
    if ((number >= 0) && (number <= 9)) {
      firstDigit = number / 10;
    }
    
    if ((number >= 10) && (number <= 99)) {
      firstDigit = number / 10;
    }
    
    if ((number >= 100) && (number <= 999)) {
      firstDigit = number / 100;
    }
    
    if ((number >= 1000) && (number <= 9999)) {
      firstDigit = number / 1000;
    }
    
    if ((number >= 10000) && (number <= 99999)) {
      firstDigit = number / 10000;
    }
    
    if (number >= 100000) {
      System.out.println("Number too long remember to enter a maximum of 5 digits");
    } else {
      System.out.println("The first digit of the number: " + number + " is " + firstDigit);
    }
    
    
  }
}
