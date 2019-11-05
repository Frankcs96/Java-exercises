public class Exercise04 {
  public static void main(String[] args) throws InterruptedException {

    int[][] num = new int[4][5];
   
    int row;
    int column;
    
    
    
    for(row = 0; row < 4; row++) {
      for(column = 0; column < 5; column++) {
       
        num[row][column] = (int)(Math.random() * ((999 - 100) + 1)) + 100; 

      }
    }

    
    int sumRow;
    for(row = 0; row < 4; row++) {
      sumRow = 0;
      for(column = 0; column < 5; column++) {
        Thread.sleep(1000);
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
      Thread.sleep(1000);
      System.out.printf("%7d   ", sumCol);
    }
    Thread.sleep(1000);
    System.out.printf("|%7d   ", totalSum);
  }
}

