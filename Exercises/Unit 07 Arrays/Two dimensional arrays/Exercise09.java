
public class Exercise09 {
  public static void main(String[] args) {
    int rows = 12;
    int cols = 12;
    int[][] numbers = new int[rows][cols];
    System.out.println("Original Array");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
        System.out.printf("%3d ", numbers[i][j]);
      }
      System.out.println();
    }


    for (int level = 0; level < 6; level++) {


      int temp1 = numbers[level][11 - level];
      for (int i = 11 - level; i > level; i--) {
        numbers[level][i] = numbers[level][i - 1];
      }

      int temp2 = numbers[11 - level][11 - level];
      
      for (int i = 11 - level; i > level + 1; i--) {
        numbers[i][11 - level] = numbers[i - 1][11 - level];
      }
      numbers[level + 1][11 - level] = temp1;


      temp1 = numbers[11 - level][level];
      for (int i = level; i < 11 - level - 1; i++) {
        numbers[11 - level][i] = numbers[11 - level][i + 1];
      }
      numbers[11 - level][11 - level - 1] = temp2;


      for (int i = level; i < 11 - level - 1; i++) {
        numbers[i][level] = numbers[i + 1][level];
      }
      numbers[11 - level - 1][level] = temp1;

    }



    System.out.println("Result Array:\n");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.printf("%3d ", numbers[i][j]);
      }
      System.out.println();
    }
  }
}
