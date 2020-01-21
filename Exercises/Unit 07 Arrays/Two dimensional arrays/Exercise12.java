
public class Exercise12 {
  public static void main(String[] args) {
    int cols = 10;
    int rows = 10;
    int[][] numbers = new int[rows][cols];

    System.out.println("Original array: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = (int) (Math.random() * ((900 - 500) + 1)) + 500;
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
    

    System.out.println("\nDiagonal numbers (bottom left to upper right)");
    int max = 500;
    int min = 900;
    int sum = 0;
    for (int i = 0; i < rows; i++) {
      if (numbers[(rows - 1) - i][0 + i] > max) {
        max = numbers[(rows - 1) - i][0 + i];
      }

      if (numbers[(rows - 1) - i][i] < min) {
        min = numbers[(rows - 1) - i][0 + i];
      }

      sum += numbers[(rows - 1) - i][0 + i];
      System.out.print(numbers[(rows - 1) - i][0 + i] + " ");

    }

    System.out.println("\nMaximum number: " + max);
    System.out.println("Minimum number: " + min);
    System.out.println("Average: " + ((double)sum / (double)10));



  }
}
