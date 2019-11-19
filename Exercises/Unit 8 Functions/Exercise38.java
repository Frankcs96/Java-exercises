
public class Exercise38 {
  public static void main(String[] args) {
    int[] numbers = {4, 232, 445, 223322, 505, 23 , 631627 , 505};
    System.out.println("Getting all the palindromes from the following array: ");
    for (int i : numbers) {
      System.out.print(i + " ");
    }
    
    int[] palindromes = arrays.OneDimension.getPalindromes(numbers);
    System.out.println("\nPalindromes:");
    for (int i : palindromes) {
      System.out.print(i + " ");
    }
  }
}
