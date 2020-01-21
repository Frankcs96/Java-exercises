import java.util.Scanner;

public class Exercise13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 10 positive or negative numbers");
    int positiveCounter = 0;
    int negativeCounter = 0;
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Number " + (i+1) +": ");
      int number = sc.nextInt();
      
      if (number < 0) {
        negativeCounter++;
      } else {
        positiveCounter++;
      }
         
    }
    
    System.out.println(positiveCounter + " Positive numbers.");
    System.out.println(negativeCounter + " Negative numbers.");
  }
}
