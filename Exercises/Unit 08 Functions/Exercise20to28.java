
public class Exercise20to28 {
  public static void main(String[] args) {

    System.out.println("Generating array of 8 positions with random numbers min 2 max 12");
    System.out.print("Array: ");
    int[] array = arrays.OneDimension.generateArray(8, 2, 12);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.print("\nMin value of the array is: " + arrays.OneDimension.minArrayInt(array));
    System.out.print("\nMax value of the array is: " + arrays.OneDimension.maxArrayInt(array));
    System.out.print("\nAverage of the array is: " + arrays.OneDimension.averageArrayInt(array));
    System.out.print("\nIs number 4 in the array?: ");
    if (arrays.OneDimension.isOnArrayInt(array, 4)) {
      System.out.print("\nYes, it is");
    } else {
      System.out.print("\nNo, it isn't");
    }

    System.out
        .print("\nNumber 4 is in the index: " + arrays.OneDimension.indexInTheArray(array, 4));
    int[] arrayReversed = arrays.OneDimension.reverseArray(array);
    System.out.print("\nArray reversed: ");

    for (int i = 0; i < arrayReversed.length; i++) {
      System.out.print(arrayReversed[i] + " ");
    }
    int[] arrayRotated3TimesRight = arrays.OneDimension.rotateArrayToRight(array, 3);
    System.out.print("\nArray rotated to the right 3 times: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrayRotated3TimesRight[i] + " ");
    }
    
    int[] arrayRotated3TimesLeft = arrays.OneDimension.rotateArrayToLeft(array, 3);
    System.out.print("\nArray rotated to the left 3 times: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(arrayRotated3TimesLeft[i] + " ");
    }

  }
}
