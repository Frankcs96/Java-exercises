
public class Exercise56 {
  public static void main(String[] args) {
    int[][] arrayBi = {
        {45, 92, 14, 20, 25, 78},
        {35, 72, 24, 45, 42, 60},
        {32, 42, 64, 23, 41, 39},
        {98, 45, 94, 11, 18, 48}
      };
    
    int[] borders = bordersOfArray(arrayBi);
    for (int i = 0; i < arrayBi.length; i++) {
      for (int j = 0; j < arrayBi[0].length; j++) {
        System.out.print(arrayBi[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Borders of the array: ");
    for (int i : borders) {
      System.out.print(i + " ");
    }


  }

  public static int[] bordersOfArray(int n[][]) {
    int counter = 0;
    int[] array = new int[n[0].length * 2 + n.length * 2 - 4];
    int[] topRow = arrays.TwoDimensions.getRowFromArray(n, 1);
    int[] botRow =
        arrays.OneDimension.reverseArray(arrays.TwoDimensions.getRowFromArray(n, n.length));
    int[] firstCol = arrays.OneDimension.reverseArray(arrays.TwoDimensions.getColFromArray(n, 1));
    int[] lastCol = arrays.TwoDimensions.getColFromArray(n, n[0].length);

    for (int i = 0; i < topRow.length - 1; i++) {
      array[counter] = topRow[i];
      counter++;
    }

    for (int i = 0; i < lastCol.length - 1; i++) {
      array[counter] = lastCol[i];
      counter++;
    }

    for (int i = 0; i < botRow.length - 1; i++) {
      array[counter] = botRow[i];
      counter++;
    }

    for (int i = 0; i < firstCol.length - 1; i++) {
      array[counter] = firstCol[i];
      counter++;
    }


    return array;
  }
}
