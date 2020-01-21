import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {

    int[][] num = new int[4][5];
    Scanner sc = new Scanner(System.in);
    int row;
    int column;
    
    
    System.out.println("Please enter numbers pressing [ENTER]");
    for(row = 0; row < 4; row++) {
      for(column = 0; column < 5; column++) {
        System.out.print("Row " + row + ", Column " + column + ": ");
        num[row][column] = sc.nextInt();
      }
    }

    
    int sumRow;
    for(row = 0; row < 4; row++) {
      sumRow = 0;
      for(column = 0; column < 5; column++) {
        System.out.printf("%7d   ", num[row][column]);
        sumRow += num[row][column];
      }
      System.out.printf("|%7d\n", sumRow);
    }
    
    
    for(column = 0; column < 5; column++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumCol;
    int totalSum = 0;
    for(column = 0; column < 5; column++) {
      sumCol = 0;
      for(row = 0; row < 4; row++) {
        sumCol += num[row][column];
      }

      totalSum += sumCol;
      System.out.printf("%7d   ", sumCol);
    }
    System.out.printf("|%7d   ", totalSum);
  }
}
