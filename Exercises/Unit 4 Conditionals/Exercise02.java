import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an hour (0-23)");
    
    int hour = sc.nextInt();
    
    if (hour >= 6 && hour <= 12) {
      System.out.println("Good Morning!");
      
    } else if (hour >= 13 && hour <= 20) {
      System.out.println("Good afternoon");
    } else if (hour >= 21 && hour <= 23 || hour <= 5 && hour >= 0) {
      System.out.println("Good evening");
      
    } else {
      System.out.println("Error... Enter a valid answer (0-23)");
    } 
    
      
    
  }
}
