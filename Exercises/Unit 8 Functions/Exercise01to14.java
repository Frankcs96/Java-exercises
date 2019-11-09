
public class Exercise01to14 {
  public static void main(String[] args) {
    if (maths.Main.isPalindrome(29)) {
      System.out.println("number 29 is palindrome");
    }

    if (maths.Main.isPalindrome(464)) {
      System.out.println("number 464 is palindrome");
    }

    if (maths.Main.isPrime(29)) {
      System.out.println("29 is prime");
    }

    if (maths.Main.isPrime(80)) {
      System.out.println("80 is prime");
    }

    System.out.println("Next prime number greater than 23 is " + maths.Main.nextPrime(23));
    System.out.println("Next prime number greater than 100 is " + maths.Main.nextPrime(100));

    System.out.println("2^10 = " + maths.Main.power(2, 10));
    System.out.println("5^(-3) = " + maths.Main.power(5, -3));
    System.out.println("10^6 = " + maths.Main.power(10, 6));

    System.out.println("Number 0 has " + maths.Main.getDigits(0) + " digit/s.");
    System.out.println("Number 7 has " + maths.Main.getDigits(7) + " digit/s.");
    System.out.println("Number 674893123 has " + maths.Main.getDigits(674893123) + " digit/s.");

    System.out.println("Number 5 reversed is " + maths.Main.reverse(5));
    System.out.println("number 398004321 reversed is " + maths.Main.reverse(398004321));
    System.out.println("number -75839 reversed is " + maths.Main.reverse(-75839));

    System.out.println("En la posición 0 del 3452 está el " + maths.Main.digitN(3452, 0));
    System.out.println("En la posición 6 del 857964034 está el " + maths.Main.digitN(857964034, 6));
    System.out.println("En la posición 4 del 857964034 está el " + maths.Main.digitN(857964034, 4));

    System.out
        .println("In the number 3452, digit 4 is in position " + maths.Main.digitPosition(3452, 4));
    System.out.println(
        "In the number 78604321, digit 4 is in position " + maths.Main.digitPosition(78604321, 1));
    System.out.println(
        "In the number 78604321,digit 4 is in position " + maths.Main.digitPosition(78604321, 7));
    System.out.println(
        "In the number 78604321, digit 4 is in position " + maths.Main.digitPosition(78604321, 5));


    System.out
        .println("If we remove 4 digits from behind to number 78604321, the remaining number is "
            + maths.Main.removeNumberBehind(78604321, 4));
    System.out.println("If we remove 1 digit from behind to number 1000, the remaining number is "
        + maths.Main.removeNumberBehind(1000, 1));


    System.out
        .println("If we remove 4 digits from the front to number 78604321, the remaining number is "
            + maths.Main.removeNumberFront(78604321, 4));
    System.out
        .println("If we remove 2 digits from the front to number 78604321, the remaining number is "
            + maths.Main.removeNumberFront(78604000, 2));

    System.out.println(
        "If you paste digit 1 to 567 from behind, you have " + maths.Main.pasteDigitBehind(567, 1));
    System.out.println(
        "If you paste digit 0 to 33 from behind, you have " + maths.Main.pasteDigitBehind(33, 0));

    System.out.println("If you paste digit 1 to 567 from the front, you have "
        + maths.Main.pasteDigitFront(567, 1));
    System.out.println(
        "If you paste digit 0 to 33 from the front, you have " + maths.Main.pasteDigitFront(33, 0));

    System.out.println("Cutting number 78604000 from position 0 to 3 equals: "
        + maths.Main.partOfNumber(78604000, 0, 3));
    System.out.println("Cutting number 78604000 from position 4 to 6 equals: "
        + maths.Main.partOfNumber(78604000, 4, 6));
    System.out.println("Cutting number 78604000 from position 2 to 2 equals: "
        + maths.Main.partOfNumber(78604000, 2, 2));

    System.out.println("Mergin 21 and 40 equals to " + maths.Main.mergeNumbers(21, 40));
    System.out
        .println("Mergin 789 and 250 equals to " + maths.Main.mergeNumbers(789, 250));
  }


}
