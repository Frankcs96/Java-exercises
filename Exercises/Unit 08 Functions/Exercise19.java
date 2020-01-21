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
    sc.nextLine();
    System.out.print("Enter a number: ");
    String number = sc.nextLine();
    String result = "";
    long stringToNumber;
    switch (option) {
      case 1:
        stringToNumber = Long.parseLong(number);
        result = decimalToBinary(stringToNumber) + "";
        break;
      case 2:
        stringToNumber = Long.parseLong(number);
        result = decimalToHexadecimal(stringToNumber);
        break;
      case 3:
        stringToNumber = Long.parseLong(number);
        result = decimalToOctal(stringToNumber) + "";
        break;
      case 4:
        stringToNumber = Long.parseLong(number);
        result = binaryToDecimal(stringToNumber) + "";
        break;
      case 5:
        stringToNumber = Long.parseLong(number);
        result = decimalToHexadecimal(binaryToDecimal(stringToNumber));
        break;
      case 6:
        stringToNumber = Long.parseLong(number);
        result = decimalToOctal(binaryToDecimal(stringToNumber)) + "";
        break;
      case 7:
        result = hexadecimalToBinary(number.toUpperCase()) + "";
        break;
      case 8:
        result = binaryToDecimal(hexadecimalToBinary(number.toUpperCase())) + "";
        break;
      case 9:
        result = decimalToOctal(binaryToDecimal(hexadecimalToBinary(number.toUpperCase()))) + "";
        break;
      case 10:
        stringToNumber = Long.parseLong(number);
        result = octalToBinary(stringToNumber) + "";
        break;
      case 11:
        stringToNumber = Long.parseLong(number);
        result = binaryToDecimal(octalToBinary(stringToNumber)) + "";
        break;
      case 12:
        stringToNumber = Long.parseLong(number);
        result =  decimalToHexadecimal(binaryToDecimal(octalToBinary(stringToNumber))) + "";
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

  public static String decimalToHexadecimal(long n) {
    String result = "";
    while (n > 0) {
      String division = n % 16 + "";

      switch (division) {
        case "10":
          result += "A";
          break;
        case "11":
          result += "B";
          break;
        case "12":
          result += "C";
          break;
        case "13":
          result += "D";
          break;
        case "14":
          result += "E";
          break;
        case "15":
          result += "F";
          break;

        default:
          result += division;
          break;
      }

      n /= 16;



    }

    int stringSize = result.length();
    String reversed = "";
    for (int i = stringSize - 1; i >= 0; i--) {
      reversed = reversed + result.charAt(i);
    }

    return reversed;
  }

  public static long decimalToOctal(long n) {
    long result = 1;
    while (n > 0) {
      int division = (int) (n % 8);
      result = maths.Main.pasteDigitBehind(result, division);

      n /= 8;

    }
    result = maths.Main.reverse(result);
    result = maths.Main.removeNumberBehind(result, 1);

    return result;
  }
  
  public static long hexadecimalToBinary(String n) {
    String digitsHexa = "0123456789ABCDEF";
    long binary = 0;
  
    for (int i = 0; i < n.length(); i++) {
      binary = binary * 10000 + decimalToBinary(digitsHexa.indexOf(n.charAt(i)));
    }

    return binary;
    
  
  }
  
  
  public static long octalToBinary(long n) {
    long binary = 0;
  
    for (int i = 0; i < maths.Main.getDigits(n); i++) {
      binary = binary * 1000 + decimalToBinary(maths.Main.digitN(n, i));
    }
    
    return binary;
  }

  

}
