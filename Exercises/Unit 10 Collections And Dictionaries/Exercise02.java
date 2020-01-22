
import java.util.ArrayList;

public class Exercise02 {

  public static void main(String[] args) {
    int listSize = (int) (Math.random() * ((20 - 10) + 1)) + 10;
    int sum = 0;
    int max = 0;
    int min = 100;

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < listSize; i++) {
      int number = (int) (Math.random() * ((100 - 0) + 1)) + 0;
      numbers.add(number);
      sum += number;

      if (number > max) {
        max = number;
      }

      if (number < min) {
        min = number;
      }
    }

    System.out.print("List: ");
    for (Integer number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println("\nSum: " + sum);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Average: " + (double) sum / listSize);

  }
}
