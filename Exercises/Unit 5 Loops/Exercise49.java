import java.util.Scanner;

public class Exercise49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please, enter positive integers. Enter a prime number to exit.");
    int number = 0; 
    int numberCounter = 0;
    int maximum = 0;
    int minimum = 0;
    double average = 0;
    int sum = 0;
    boolean isPrime = false;
    
    while (!isPrime) {
      number = sc.nextInt();
      isPrime = true;
      
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          
        }       
         
      }
      
      
      if (!isPrime) {
        numberCounter++;
        sum += number;
        average = (double) sum / (double) numberCounter;
        
        if (number < minimum || minimum == 0) {
          minimum = number;
        }
        
        
        if (number > maximum) {
          maximum = number;   
        }
        
               
            
      }
     
      
      
    }
    
    System.out.println("You entered: " + numberCounter + " non prime numbers");
    System.out.println("Maximum: " + maximum);
    System.out.println("Minimum: " + minimum); 
    System.out.println("average: " + average);  
    
  }
}
