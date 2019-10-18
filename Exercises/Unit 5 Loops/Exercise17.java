import java.util.Scanner;

public class Exercise17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive number");
    int number = sc.nextInt();
    int sum = 0;
    
    while (number < 0) {
      System.out.println("The number must be positive... try again");
      number = sc.nextInt();
    }
    
    for (int i = number; i < number + 100; i++) {
      sum += i;
    }
    
    
    System.out.println("The sum of the number " + number + " plus the next 100 numbers is " + sum);
  }
}
