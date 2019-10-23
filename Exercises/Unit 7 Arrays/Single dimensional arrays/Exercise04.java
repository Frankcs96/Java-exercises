import java.util.Scanner;

public class Exercise04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] number = new int[20];
    int[] square = new int[20];
    int[] cube = new int[20];

    for (int i = 0; i < number.length; i++) {
      number[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
    }

    for (int i = 0; i < square.length; i++) {
      square[i] = (int) Math.pow(number[i], 2);
    }

    for (int i = 0; i < cube.length; i++) {
      cube[i] = (int) Math.pow(number[i], 3);
    }

    System.out.print("Number     Square      Cube\n");
    System.out.println("------------------------------");

    for (int i = 0; i < cube.length; i++) {
      System.out.printf("%5d     %7d    %7d\n", number[i], square[i], cube[i]);
    }
  }
}
