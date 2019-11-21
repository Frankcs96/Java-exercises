
public class Exercise40 {
  public static void main(String[] args) {
    int[] numbers = {1, 7, 23, 427, 712, 4731, 777777, 6512};
    System.out.println("Getting all the numbers with a 7 in the array: ");
    for (int i : numbers) {
      System.out.print(i + " ");
    }

    int[] numbersWith7 = arrays.OneDimension.getNumbersWith7(numbers);
    System.out.println("\nNumbers with 7:");
    for (int i : numbersWith7) {
      System.out.print(i + " ");
    }


  }
}
