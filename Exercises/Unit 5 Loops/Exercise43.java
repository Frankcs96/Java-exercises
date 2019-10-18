import java.util.Scanner;

public class Exercise43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please, enter a positive integer: ");
    long number = sc.nextLong();
    long reversed = 0;
    long newNumber1 = 0;
    long newNumber2 = 0;
    
    System.out.print("Enter the position where you want to split the number: ");
    int position = sc.nextInt();
    
    while (number > 0) {
      reversed = (reversed * 10) + (number % 10);
      number /= 10;
    }
    
    for (int i = 1; i < position; i++) {
      newNumber1 = (newNumber1 * 10) + (reversed % 10);
      reversed /= 10;
                
    }
    
    while (reversed > 0) {
      newNumber2 = (newNumber2 * 10) + (reversed % 10);
      reversed /= 10;   
    }
    
    System.out.println("Splited numbers are " + newNumber1 + " and " + newNumber2);
    
    
    
    
  }
}
