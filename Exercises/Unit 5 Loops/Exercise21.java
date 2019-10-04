import java.util.Scanner;

public class Exercise21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter all the numbers you want. If you want to exit enter a negative one");
    int number;
    int numbersCounter = 0;
    int oddSum = 0;
    int oddNumbersCounter = 0;
    int greaterEvenNumber = 0;
    
    
    do {
      number = sc.nextInt();
      numbersCounter++;
      
      if ((number % 2 != 0) && (number >= 0)) {
        oddSum += number;
        oddNumbersCounter++;
      } else {
        
        if (greaterEvenNumber < number) {
          greaterEvenNumber = number;
        }
        
        
      }
      
      
    } while (number >= 0);
    
    
    System.out.println("You entered " + (numbersCounter - 1) + " numbers");
    System.out.println("The average of the odd numbers is " + oddSum / oddNumbersCounter);
    System.out.println("The highest even number is " + greaterEvenNumber);
  }
}
