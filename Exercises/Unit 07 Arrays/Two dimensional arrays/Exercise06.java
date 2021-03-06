

public class Exercise06 {
  public static void main(String[] args) {
    int rows = 6;
    int cols = 10;
    int[][] numbers = new int[rows][cols];
    int max = 0;
    int min = 1000;
    boolean repeated;


    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {

        do {
          numbers[i][j] = (int) (Math.random() * ((1000 - 0) + 1)) + 0;
          repeated = false;
          for (int k = 0; k < cols * i + j; k++) {
            if (numbers[i][j] == numbers[k / cols][k % cols]) {
              repeated = true;
            }
          }

        } while (repeated);



        if (numbers[i][j] > max) {
          max = numbers[i][j];
        }

        if (numbers[i][j] < min) {
          min = numbers[i][j];
        }
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (numbers[i][j] == max) {
          System.out.println("Position of the max number: row " + (i + 1) + " col " + (j + 1));
        }

        if (numbers[i][j] == min) {
          System.out.println("Position of the min number: row " + (i + 1) + " col " + (j + 1));
        }

      }
    }

    System.out.println();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }

  }
}
