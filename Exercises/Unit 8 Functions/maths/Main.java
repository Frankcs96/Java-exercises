package maths;

public class Main {
  
  public static int reverse(int x) {
    int reversed = 0;
    if (x < 0) {
      x = -(x);
    }
    while (x > 0) {
      reversed = (reversed * 10) + (x % 10);
      x /= 10;
    }
    return reversed;
  };
  
  public static boolean isPalindrome (int x) {
    if (reverse(x) == x) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean isPrime (int x) {
    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static int nextPrime (int x) {
    x++;
    while (isPrime(x) == false) {
      x++;
    }
    
    return x;
  }
}

