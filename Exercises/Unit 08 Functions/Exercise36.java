
public class Exercise36 {
  public static void main(String[] args) {
    int[] numbers = {1, 14, 13, 59, 13, 73, 100, 97};
    System.out.println("Getting all the prime numbers from the following array: ");
    for (int i : numbers) {
      System.out.print(i + " ");
    }
    int[] primes = arrays.OneDimension.getPrimes(numbers);
    System.out.println("\nPrimes:");
    for (int i : primes) {
      System.out.print(i + " ");
    }

  }
}
