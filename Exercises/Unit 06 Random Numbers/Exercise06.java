import java.util.Scanner;

public class Exercise06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int attempts = 5;
    int randomNumber = (int) ((Math.random() * ((100 - 0) + 1)) + 0);
    int answer = 0;
    System.out.println("I'm thinking about a number between 0 and 100, try to guess it");
    
    
    do {
      
      System.out.print("Enter a number (" + attempts + " attempts left): ");
      answer = sc.nextInt();
      attempts--;
      if (answer > randomNumber && attempts > 0) {
        System.out.println("Wrong answer... My number is smaller than " + answer);
      }
      if (answer < randomNumber && attempts > 0) {
        System.out.println("Wrong answer... My number is bigger than " + answer); 
      }
      
      
      
    } while (answer != randomNumber && attempts > 0);
    
    if (answer == randomNumber) {
      System.out.println("Congratulations you guess it");
    } else {
      System.out.println("Out of attempts... you lose. The number was " + randomNumber);
    }
    
  }
}
