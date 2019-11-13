import java.util.Scanner;

public class Exercise18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("****Decimal to binary converter****");
    System.out.print("Enter a decimal number: ");
    long number = sc.nextLong();
    System.out.print("Number " + number + " converted to binary is " + decimalToBinary(number));
  }


  public static long decimalToBinary(long n) {

    long binary = 1;
    while (n > 1) {
      binary = maths.Main.pasteDigitBehind(binary, (int) (n % 2));
      n /= 2;
    }
    
    binary = maths.Main.pasteDigitBehind(binary, 1);
    binary = maths.Main.reverse(binary);
    binary = maths.Main.removeNumberBehind(binary, 1);

   

    return binary;
  }
}
