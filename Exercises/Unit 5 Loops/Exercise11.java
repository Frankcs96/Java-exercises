import java.util.Scanner;

public class Exercise11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    
    System.out.println("Number    Squared     Cubed");
    for (int i = number; i < number + 5; i++) {
      System.out.printf("%5d %10d %10d\n" , i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
    }

  }
}
