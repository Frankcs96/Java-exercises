import java.util.Scanner;

public class Exercise04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter how many hours you worked this week");
    int hours = sc.nextInt();
    int salary = 0;
    int extra = hours - 40;
    
    if (hours <= 40) {
      salary = 12 * hours;
    } else {
      salary = (12 * 40) + (16 * extra);
    }  
    
    System.out.println("Your salary this week is " + salary + " euros");
  }
}
