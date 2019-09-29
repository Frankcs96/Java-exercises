import java.util.Scanner;


public class Exercise08 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many hours did you work this week?"); 
    double hours = sc.nextDouble();
    double salary = hours * 12;
    
    System.out.println("Your salary this week is " + salary + " Euros");
    
    
    
  }
}

