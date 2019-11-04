
public class Exercise01 {
  public static void main(String[] args) throws InterruptedException {
    int rows = 3;
    int columns = 6;
    int[][] numbers = new int[rows][columns];
    
    numbers[0][0] = 0;
    numbers[0][1] = 30;
    numbers[0][2] = 2;
    numbers[0][5] = 5;
    numbers[1][0] = 75;
    numbers[1][4] = 0;
    numbers[2][2] = -2;
    numbers[2][3] = 9;
    numbers[2][5] = 11;
    System.out.print("    ");
    for (int i = 0; i < columns; i++) {
      System.out.print("   Column " + i + " ");
    }
    System.out.println();
    
    for (int i = 0; i < rows; i++) {
      System.out.print("\nRow " + i + " ");
      for (int j = 0; j < columns; j++) {
        
        System.out.printf("%9d   ",numbers[i][j]);
        Thread.sleep(600);
      }
      
      System.out.println();
    }
  }
}
