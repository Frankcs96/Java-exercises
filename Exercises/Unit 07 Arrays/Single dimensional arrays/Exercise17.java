import java.util.Scanner;

public class Exercise17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
    }

    for (int i : numbers) {
      System.out.print(i + " ");
    }

    int userOption;
    boolean isOnArray = false;
   
    
    do {
      
      System.out.print("\nEnter a number from the array: ");
      userOption = sc.nextInt();
      for (int i : numbers) {
        if (userOption == i) {
          isOnArray = true;
        }
        
      }

      if (isOnArray == false) {
        System.out.println("The number is not in the array try again.");
      }

    } while (isOnArray == false);
    
    
    
    
    while (userOption != numbers[0]) {   
    
      for (int i = 0; i < numbers.length - 1; i++) {
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[0];
        numbers[0] = temp;
      }
    }
    for (int i : numbers) {
      System.out.print(i + " ");
    }
    

  }
}
