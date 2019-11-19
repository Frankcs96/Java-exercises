package arrays;

public class OneDimension {

  public static int[] generateArray(int size, int min, int max) {

    int array[] = new int[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * ((max - min) + 1)) + min;
    }

    return array;
  }

  public static int minArrayInt(int[] array) {
    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static int maxArrayInt(int[] array) {
    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public static double averageArrayInt(int[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum / array.length;
  }

  public static boolean isOnArrayInt(int[] array, int n) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        return true;
      }


    }
    return false;
  }

  public static int indexInTheArray(int[] array, int n) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        return i;
      }
    }

    return -1;
  }

  public static int[] reverseArray(int[] array) {
    int[] reversedArray = new int[array.length];
    for (int i = array.length - 1; i >= 0; i--) {
      reversedArray[(array.length - 1) - i] = array[i];
    }

    return reversedArray;
  }

  public static int[] rotateArrayToRight(int[] array, int times) {
    int[] arrayRotated = array.clone();
    for (int i = 0; i < times; i++) {
      for (int j = arrayRotated.length - 1; j > 0; j--) {
        int temp = arrayRotated[j];
        arrayRotated[j] = arrayRotated[j - 1];
        arrayRotated[j - 1] = temp;
      }
    }

    return arrayRotated;
  }

  public static int[] rotateArrayToLeft(int[] array, int times) {
    int[] arrayRotated = array.clone();
    for (int i = 0; i < times; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        int temp = arrayRotated[j];
        arrayRotated[j] = arrayRotated[j + 1];
        arrayRotated[j + 1] = temp;
      }
    }

    return arrayRotated;
  }

  public static int[] getPrimes(int x[]) {
    int counter = 0;
    for (int i = 0; i < x.length; i++) {
      if (maths.Main.isPrime(x[i])) {
        counter++;
      }
    }

    if (counter == 0) {
      int[] primes = new int[1];
      primes[0] = -1;
      return primes;
    }

    int[] primes = new int[counter];
    counter = 0;
    for (int i = 0; i < x.length; i++) {
      if (maths.Main.isPrime(x[i])) {
        primes[counter++] = x[i];
      }
    }

    return primes;
  }

  public static int[] getPalindromes(int x[]) {
    int counter = 0;
    for (int i = 0; i < x.length; i++) {
      if (maths.Main.isPalindrome(x[i])) {
        counter++;
      }
    }

    if (counter == 0) {
      int[] palindromes = new int[1];
      palindromes[0] = -1;
      return palindromes;
    }

    int[] palindromes = new int[counter];
    counter = 0;
    for (int i = 0; i < x.length; i++) {
      if (maths.Main.isPalindrome(x[i])) {
        palindromes[counter++] = x[i];
      }
    }

    return palindromes;
  }
}
