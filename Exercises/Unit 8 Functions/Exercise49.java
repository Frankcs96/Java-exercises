import java.util.Scanner;

public class Exercise49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String number = "1";
    System.out.print("Enter how many numbers of the look and say sequence do you want: ");
    int times = sc.nextInt();
    String result = "";
    System.out.print("1, ");
    int counter = 1;
    for (int j = 0; j < times - 1; j++) {
      for (int i = 0; i < number.length() - 1; i++) {
        if (number.charAt(i) == number.charAt(i + 1)) {
          counter++;
        } else {
          result += counter + "" + number.charAt(i);
          counter = 1;
        }

      }
      result += counter + "" + number.charAt(number.length() - 1);
      if (j == times - 2) {
        System.out.print(result);
      } else {
        System.out.print(result + ", ");
      }

      number = result;
      result = "";
      counter = 1;
    }
  }
}
