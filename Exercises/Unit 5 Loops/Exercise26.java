import java.util.Scanner;

public class Exercise26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = sc.nextInt();

    System.out.println("Now enter a digit");
    int digit = sc.nextInt();
    int digitPosition = 1;
    int reversedNumber = 0;

    System.out.print("the number " + digit + " on the number " + number + " from left to right"
        + " is in position: ");

    while (number != 0) {

      reversedNumber = (reversedNumber * 10) + (number % 10);
      number /= 10;

    }

    while (reversedNumber != 0) {
      if (reversedNumber % 10 == digit) {
        System.out.print(digitPosition);
        System.out.print(" ");

      }

      reversedNumber /= 10;
      digitPosition++;
    }

  }
}
