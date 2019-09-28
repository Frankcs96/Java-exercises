import java.util.Scanner;

public class Exercise11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("****Seconds until midnight calculator****");
    System.out.println("Please enter an hour: ");
    int hour = sc.nextInt();
    
    System.out.println("Please enter the minutes: ");
    int minutes = sc.nextInt();
    int seconds = 0;
      
    seconds += (24 - hour) * 3600 - (minutes * 60);
    
    System.out.printf("From %02d:%02d to midnight, there are only %d seconds left.",
    hour, minutes,seconds );
    
  }
}
