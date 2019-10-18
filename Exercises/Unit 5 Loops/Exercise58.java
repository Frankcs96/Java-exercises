import java.util.Scanner;

public class Exercise58 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    long number = sc.nextLong();
    int counter = 0;
    int sum = 0;
    double average;
    
    while (number > 0) {
      counter++;
      sum+= number % 10;
      number /= 10;
      
    }
    
    average = (double) sum / counter;
    
    System.out.print("Average of the number digits is: " + average);
    
    
    
  }
}
