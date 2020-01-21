import java.util.Scanner;

public class Exercise25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number and the program will reverse it");
    int number = sc.nextInt();
    int reversedNumber = 0;
   
    while (number != 0) { 
      reversedNumber = (reversedNumber * 10) + (number % 10);
      number /= 10;
    }
    
    System.out.println("Reversed number: " + reversedNumber);
    
  
    
    
    
  }
}
