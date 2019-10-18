import java.util.Scanner;

public class Exercise10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter positive numbers to calculate the average "
        + "(if you enter a negative number the program will finish)");
    double numbersSum = 0;
    int numbersCounter = 0;
    double number = 0;
    
    while (number >= 0) {
      number = sc.nextDouble();
      if (number > 0) {
        numbersCounter++;
        numbersSum += number;
      }
      
    }
    System.out.println("Average: " + numbersSum / numbersCounter);
    
  }
}
