import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("****Number base converter****");
    System.out.println("Choose an option: ");
    System.out.println("1) From decimal to binary");
    System.out.println("2) From decimal to hexadecimal");
    System.out.println("3) From decimal to octal");
    System.out.println("4) From binary to decimal");
    System.out.println("5) From binary to hexadecimal");
    System.out.println("6) From binary to octal");
    System.out.println("7) From hexadecimal to binary");
    System.out.println("8) From hexadecimal to decimal");
    System.out.println("9) From hexadecimal to octal");
    System.out.println("10) From octal to binary");
    System.out.println("11) From octal to decimal");
    System.out.println("12) From octal to hexadecimal");

    int option = sc.nextInt();
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    String result = "";

    switch (option) {
      case 1:
        result = decimalToBinary(number) + "";
        break;
      case 2:
        result = decimalToHexadecimal(number);
        break;
      case 3:

        break;
      case 4:
        result = binaryToDecimal(number) + "";
        break;
      case 5:

        break;
      case 6:

        break;
      case 7:

        break;
      case 8:

        break;
      case 9:

        break;
      case 10:

        break;
      case 11:

        break;
      case 12:

        break;

      default:
        System.out.println("Wrong option");
        break;
    }
    
    System.out.println("Your number converted is: " + result);


  }

  public static int binaryToDecimal(long n) {

    int bits = maths.Main.getDigits(n);
    int result = 0;
    for (int i = 0; i < bits; i++) {
      if (n % 10 == 1) {
        result += maths.Main.power(2, i);
      }
      n /= 10;
    }

    return result;
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
  
  public static String decimalToHexadecimal (long n) {
    String result ="";
    while (n > 0) {
      result += n % 16 + "";
      
      n /= 16;
      
    }
    
   
    return result;
  }
  
  public static long decimaltoOctal (long n) {
    return n;
  }
  
  public static long binaryToHexadecimal (long n) {
    return n;
  }
  
  public static long binaryToOctal (long n) {
    return n;
  }
  
  public static long HexadecimalToBinary (long n) {
    return n;
  }
  
  public static long HexadecimalToDecimal (long n) {
    return n;
  }
  
  public static long HexadecimalToOctal (long n) {
    return n;
  }
  
  public static long OctalToBinary (long n) {
    return n;
  }
  
  public static long OctalToHexadecimal (long n) {
    return n;
  }
  
  public static long OctalToDecimal (long n) {
    return n;
  }
  
  
}
