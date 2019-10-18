import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int combination = 1234;
    int attempt = 4;
    boolean isCorrect = false;
    
    while ((isCorrect == false) && (attempt > 0)) {
      
      System.out.println("Enter the combination (4 digits) " + attempt +" attempts left");
      int userCombination = sc.nextInt();
      
      if (userCombination == combination) {
        isCorrect = true;
        System.out.println("Correct! opening safe");
      } else {
        System.out.println("Wrong combination");
        attempt--;
      }
      
      if (attempt == 0) {
        System.out.println("Out of attempts... safe locked");
      }
      
      
    }
  }
}
