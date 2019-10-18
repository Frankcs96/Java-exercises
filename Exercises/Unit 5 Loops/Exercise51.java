import java.util.Scanner;

public class Exercise51 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    long option = sc.nextLong();
    long number = option;
    long reversed = 0;
    long finalNumber = 0;
    
    while (number > 0) {
      if (number % 10 != 0 && number % 10 != 8) {
        reversed = (reversed * 10) + (number % 10);
        
      }
      
      number /= 10;
      
    }
    
   
    
    while (reversed > 0) {
      
      finalNumber = (finalNumber * 10) + (reversed % 10);
      
      reversed /= 10;
    }
    
    if (finalNumber == option) {
      System.out.println("no number has been eaten by the numeric worm");
    } else {
      
      System.out.println("after being eaten by the numeric worm is: " + finalNumber);
      
    }
    
    
    
    
  }
}
