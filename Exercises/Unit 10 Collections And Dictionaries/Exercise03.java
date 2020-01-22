
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Exercise03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
      numbers.add(sc.nextInt());
    }

    Collections.sort(numbers);
    System.out.println("ArrayList sorted: ");
    for (Integer number : numbers) {
      System.out.print(number + " ");
    }
  }
}
