import java.util.Scanner;

public class Exercise24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please, enter a positive integer: ");
    long number = sc.nextLong();
    int digits = (int) (Math.log10(number) + 1);
    int random = (int)(Math.random() * (((digits) - 1) + 1)) + 1;
    
    if (digits > 1) {
      for (int i = 1; i < random; i++) {
        number /= 10;
      }
      System.out.print("Random digit: " + number % 10);
    } else {
      System.out.println(number);
    }
    
    
    
    
    
    
    
  }
}
