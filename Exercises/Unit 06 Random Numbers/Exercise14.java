import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    int attempts = 5;
    int option;
    int max = 100;
    int min = 0;
    boolean isGuess = false;
    
    System.out.println("Please, think a number between 0 and 100 and I'll try to guess it");
    System.out.println("I have only 5 attempts... let's begin.\n---------------------------");
    
    do {
      number = (int)(Math.random() * ((max - min) + 1)) + min;
      System.out.println("Are you thinking about number " + number + " ? (attempt: " + attempts + 
          ")");
      System.out.println("1) No, is bigger 2) No, is smaller 3) Yes, you are right");
      option = sc.nextInt();
      
      if (option == 3) {
        System.out.println("Yes! I know im a genious :)");
        isGuess = true;
      }
      
      if (option == 1) {
        min = number + 1;
        attempts--;
        
      }
      
      if (option == 2) {
        max = number - 1;
        attempts--;
      }
      
    } while (!isGuess && attempts > 0);
    
    
    if (attempts == 0) {
      System.out.println("I lose... I'm not as clever as I expected. :(");
    }
    
  }
}
