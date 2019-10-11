import java.util.Scanner;

public class Exercise48 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please enter an integer: ");
    long number = sc.nextLong();
    boolean isDigit = false;
    String digits = "";
    String notDigits = "";
    
    System.out.print("Digits that belong to the number: ");
    for (int i = 0; i <= 9; i++) {
      isDigit = false;
      long numberIteration = number;
      
      while (numberIteration > 0) {
        if (numberIteration % 10 == i) {
          isDigit = true;
          
        }
        numberIteration /= 10;
      }
      
      if (isDigit) {
        digits += i;
        digits += " ";
      } else {
        notDigits +=i;
        notDigits += " ";
      }
    }
    
    System.out.println("Digits that belong to the number: " + digits);
    System.out.print("Digits that not belong to the number: " + notDigits);
  }
}
