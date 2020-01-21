import java.util.Scanner;

public class Exercise39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    System.out.print("Your number to words is: " + transformToWords(number));

  }


  public static String transformToWords(int n) {
    String[] words =
        {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    
    String result = "";
    for (int i = 0; i < maths.Main.getDigits(n); i++) {
      result += words[maths.Main.digitN(n, i)];
      if(i != maths.Main.getDigits(n) - 1) {
        result += ", ";
      }
    }
    return result;
  }
}
