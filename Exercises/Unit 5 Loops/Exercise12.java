import java.util.Scanner;

public class Exercise12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers of the fibonacci sequence do you want?");
    int number = sc.nextInt();
    int lastNum1 = 0;
    int lastNum2= 0;
    
    
    for (int i = 0; i < number; i++) {
      if (i == 0) {
        System.out.print(i + " ");
        lastNum1 = i;
      } else if (i == 1) {
        System.out.print(i + " ");
        lastNum2 = i;
      } else {
        int sum = lastNum1 + lastNum2;
        System.out.print(sum + " ");
        lastNum1 = lastNum2;
        lastNum2 = sum;
               
      }
    }
  }
}
