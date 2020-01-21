
public class Exercise51 {
  public static void main(String[] args) {
    System.out.println("Generated array: ");
    int[] array = arrays.OneDimension.generateArray(10, 2, 100);
    for (int i : array) {
      System.out.print(i + " ");
    }
    for (int i : array) {
      System.out.print("\nThe number " + i);
      if (maths.Main.isPrime(i)) {
        System.out.print(" is Prime ");
      } else {
        System.out.print(" is not Prime ");
      }

      if (maths.Main.isPalindrome(i)) {
        System.out.print("and is palindrome.");
      } else {
        System.out.print("and is not palindrome");
      }
    }


  }
}
