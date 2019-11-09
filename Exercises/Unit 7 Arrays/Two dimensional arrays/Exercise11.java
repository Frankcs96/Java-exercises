
public class Exercise11 {
  public static void main(String[] args) {
    int cols = 10;
    int rows = 10;
    int[][] numbers = new int[rows][cols];

    System.out.println("Original array: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = (int) (Math.random() * ((300 - 200) + 1)) + 200;
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
    

    System.out.println("\nDiagonal numbers (Upper left to bottom right)");
    int max = 200;
    int min = 300;
    int sum = 0;
    for (int i = 0; i < rows; i++) {
      if (numbers[i][i] > max) {
        max = numbers[i][i];
      }

      if (numbers[i][i] < min) {
        min = numbers[i][i];
      }

      sum += numbers[i][i];
      System.out.print(numbers[i][i] + " ");

    }

    System.out.println("\nMaximum number: " + max);
    System.out.println("Minimum number: " + min);
    System.out.println("Average: " + ((double)sum / (double)10));



  }
}
