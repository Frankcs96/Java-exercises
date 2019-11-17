package arrays;

public class TwoDimensions {

  public static int[][] generateArrayBiInt(int row, int col, int min, int max) {
    int[][] arrayBi = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arrayBi[i][j] = (int) (Math.random() * ((max - min) + 1)) + min;

      }
    }

    return arrayBi;
  }

  public static int[] getRowFromArray(int[][] array, int row) {
    int[] rows = new int[array[0].length];

    for (int i = 0; i < rows.length; i++) {
      rows[i] = array[row - 1][i];
    }

    return rows;
  }

  public static int[] getColFromArray(int[][] array, int col) {
    int[] cols = new int[array.length];

    for (int i = 0; i < cols.length; i++) {
      cols[i] = array[i][col - 1];
    }

    return cols;
  }

  public static int[] coordsInArrayBi(int[][] array, int n) {
    int[] coords = new int[2];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == n) {
          coords[0] = i + 1;
          coords[1] = j + 1;
          return coords;
        }
      }
    }

    coords[0] = -1;
    coords[1] = -1;
    return coords;
  }

  public static boolean isSaddlePoint(int[][] array, int i, int j) {
    int row[] = getRowFromArray(array, i);
    int col[] = getColFromArray(array, j);

    return (arrays.OneDimension.minArrayInt(row) == array[i][j]
        && arrays.OneDimension.maxArrayInt(col) == array[i][j]);

  }

  public static int[] getDiagonal(int[][] array, int row, int col, String dir) {
    row--;
    col--;
    int numbersInDiagonal = 0;
    int[] diagonalTemp = new int[2000];
    if (dir.equalsIgnoreCase("nose")) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[0].length; j++) {
          if ((row - i) == (col - j)) {
            diagonalTemp[numbersInDiagonal++] = array[i][j];
          }
        }
      }


    } else if (dir.equalsIgnoreCase("neso")) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[0].length; j++) {
          if (((row - i)) == (j - col)) {
            diagonalTemp[numbersInDiagonal++] = array[i][j];
          }
        }
      }
    } else {
      System.out.println("Wrong direction");
    }

    int[] diagonal = new int[numbersInDiagonal];
    for (int i = 0; i < diagonal.length; i++) {
      diagonal[i] = diagonalTemp[i];
    }

    return diagonal;


  }
}
