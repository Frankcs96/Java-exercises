import java.util.Scanner;

public class Exercise62 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);       // luck 3 7 8 9
    System.out.print("Enter a number: ");
    long number = sc.nextInt();
    long temp = number;
    int luckyNumberCounter = 0;
    int unluckyNumberCounter = 0;
    
    while (number > 0) {
      if (number % 10 == 3 || number % 10 == 7 || number % 10 == 8 || number % 10 == 9) {
        luckyNumberCounter++;
      } else {
        unluckyNumberCounter++;
      }
      
      number /= 10;
    }
    
    if (luckyNumberCounter > unluckyNumberCounter) {
      System.out.println("the Number " + temp + " is a lucky one");
    } else {
      System.out.println("the Number " + temp + " is not a lucky one");
    }
    
    
    
    
  }
}
