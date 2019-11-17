
public class Exercise29to34 {
  public static void main(String[] args) {
    System.out.println("Generating array of 6 rows and 6 cols with random numbers, min 2 max 9");
    System.out.println("Array: ");
    int[][] array = arrays.TwoDimensions.generateArrayBiInt(6, 6, 2, 9);

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    System.out.print("Printing row 3: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrays.TwoDimensions.getRowFromArray(array, 3)[i] + " ");
    }

    System.out.print("\nPrinting col 4: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrays.TwoDimensions.getColFromArray(array, 4)[i] + " ");
    }

    System.out.println("\nRow and col of first number 5 in the array:");

    int coords[] = arrays.TwoDimensions.coordsInArrayBi(array, 5);
    System.out.println("Row: " + coords[0]);
    System.out.println("Col: " + coords[1]);

    System.out.println("Number in row 3 and col 2 is a saddle point?");
    System.out.println(arrays.TwoDimensions.isSaddlePoint(array, 3, 2));

    System.out.println("Numbers from the diagonal row 2 col 3 direction NOSE");
    int[] diagonal = arrays.TwoDimensions.getDiagonal(array, 2, 3, "nose");
    
    for (int i = 0; i < diagonal.length; i++) {
      System.out.print(diagonal[i] + " ");
    }
  }
}
