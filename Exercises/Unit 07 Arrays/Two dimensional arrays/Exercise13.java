
public class Exercise13 {
  public static void main(String[] args) {

    String[] country = {"Spain", "Russia", "Japan", "Australia"};
    int cols = 10;
    int rows = 4;
    int[][] numbers = new int [rows][cols];
    int min = 210;
    int max = 140;
    int sum = 0;
    
    System.out.println("                                                     AVG MIN MAX");
    
    for (int i = 0; i < rows; i++) {
      System.out.printf("%9s: ", country[i]);
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = (int)(Math.random() * ((210 - 140) + 1)) + 140;
        if (numbers[i][j] > max) {
          max = numbers[i][j];
        }

        if (numbers[i][j] < min) {
          min = numbers[i][j];
        }

        sum += numbers[i][j];
        System.out.print(numbers[i][j] + " ");
        
      }
      System.out.print("| " + sum / 10 + " " + min + " " + max);
      sum = 0;
      max = 140;
      min = 210;
      System.out.println();
    }
  }
}
