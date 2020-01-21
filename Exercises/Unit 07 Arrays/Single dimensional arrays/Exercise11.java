import java.util.Scanner;

public class Exercise11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[10];
    int[] prime = new int[10];
    int[] notPrime = new int[10];
    System.out.println("Enter 10 numbers pressing [ENTER]: ");

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.println("Original array:");
    System.out.print("index: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%6d ", i);
    }
    System.out.print("\nValue: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%6d ", numbers[i]);
    }
    boolean isPrime = true;
    int counter1 = 0;
    int counter2 = 0;
    for (int i = 0; i < numbers.length; i++) {
      isPrime = true;
      if (numbers[i] == 1) {
        isPrime = false;
      }
      for (int j = 2; j < numbers[i]; j++) {
        if (numbers[i] % j == 0) {
          isPrime = false;
        }
        
      }
      
      if (isPrime) {
        prime[counter1] = numbers[i];
        counter1++;
      } else {
        notPrime[counter2] = numbers[i];
        counter2++;
      }
      
    }
 
    for (int i = 0; i < counter1 ; i++) {
      numbers[i] = prime[i];
      
      
    }
    
    for (int i = counter1; i < numbers.length ; i++) {
      numbers[i] = notPrime[i - counter1];
    }
    
    
    
    System.out.println("\nFinal array:");
    System.out.print("index: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%6d ", i);
    }
    System.out.print("\nValue: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%6d ", numbers[i]);
    }
    
    

  }
}
