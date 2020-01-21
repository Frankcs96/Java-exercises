package maths;

public class Main {

  public static long reverse(long x) {

    if (x < 0) {
      return -reverse(-x);
    }
    long reversed = 0;
    while (x > 0) {
      reversed = (reversed * 10) + (x % 10);
      x /= 10;
    }
    return reversed;
  }
  /**
   * Return true if the number is Palindrome false if not
   * 
   * @param Number that we are evaluating if is palindrome
   * @return  True if is palindrome false if not
   */
  public static boolean isPalindrome(long x) {
    if (reverse(x) == x) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isPrime(long x) {
    if (x < 2) {
      return false;
    } else {

      for (int i = 2; i < x; i++) {
        if (x % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static long nextPrime(long x) {
    x++;
    while (isPrime(x) == false) {
      x++;
    }

    return x;
  }

  public static double power(int base, int exp) {
    int power = 1;
    if (exp == 0) {
      return 1;
    }

    if (exp < 0) {
      return 1 / power(base, -exp);
    }

    for (int i = 0; i < exp; i++) {
      power = power * base;
    }
    return power;
  }

  public static int getDigits(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    }
    return (int) (Math.log10(x) + 1);
  }

  public static int digitN(long x, int pos) {
    int counter = getDigits(x) - pos;

    for (int i = 0; i < counter - 1; i++) {
      x /= 10;
    }

    return (int) (x % 10);
  }

  public static int digitPosition(long x, int digit) {
    int digits = getDigits(x);
    int counter = 0;

    for (int i = 0; i < digits; i++) {
      if (x % 10 == digit) {
        return (digits - i) - 1;
      }
      x /= 10;
    }

    return -1;
  }

  public static long removeNumberBehind(long x, int digits) {

    return (long) (x / power(10, digits));

  }

  public static long removeNumberFront(long x, int digits) {
    return (long) (x % power(10,getDigits(x) - digits));

  }
  
  public static long pasteDigitBehind(long x, int digit) {
    return x * 10 + digit;
  }
  
  public static long pasteDigitFront(long x, int digit) {
    return (long) (digit * power(10,getDigits(x))) + x;
  }
  
  public static long partOfNumber (long x, int posI, int posF) {
    int size = getDigits(x);
    x = removeNumberFront(x, posI);
    x = removeNumberBehind(x, size - posF - 1);
    return x;
  }
  
  public static long mergeNumbers (long x, long y) {
    return (long) (x * power(10,getDigits(y)) + y);
  }
}

