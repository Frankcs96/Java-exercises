import java.util.Scanner;

public class Exercise10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cols = 3;
    int rows = 3;
    String[][] board = new String[rows][cols];
    int movements = 0;
    boolean running = true;
    int rowUser;
    int colUser;
    String playerTurn = "";


    System.out.println("****Welcome to tic tac toe game****");
    System.out.println("Player 1 is X and player 2 is O good luck and have fun");
    System.out.println("-----------------------------------------------------------");
    for (int i = 0; i < rows; i++) {
      System.out.print((i + 1) + "|");
      for (int j = 0; j < cols; j++) {
        board[i][j] = " ";
        System.out.print(board[i][j] + "|");

      }
      System.out.println();
    }
    System.out.println("  1 2 3");

    while (running) {

      do {


        if (movements == 0 || movements % 2 == 0) {
          playerTurn = "X";
          System.out.println("Player 1 turn: Enter your move. ");
          System.out.print("Row: ");
          rowUser = sc.nextInt();
          System.out.print("Col: ");
          colUser = sc.nextInt();
          System.out.println();

        } else {
          playerTurn = "O";
          System.out.println("Player 2 turn: Enter your move. ");
          System.out.print("Row: ");
          rowUser = sc.nextInt();
          System.out.print("Col: ");
          colUser = sc.nextInt();
          System.out.println();

        }

        if (!board[rowUser - 1][colUser - 1].equals(" ")) {
          System.out.println("Slot in use try again with another position.");
        }
      } while (!board[rowUser - 1][colUser - 1].equals(" "));
      movements++;


      for (int i = 0; i < rows; i++) {
        System.out.print((i + 1) + "|");
        for (int j = 0; j < cols; j++) {
          board[rowUser - 1][colUser - 1] = playerTurn;
          System.out.print(board[i][j] + "|");

        }
        System.out.println();
      }

      System.out.println("  1 2 3");

      for (int i = 0; i < 3; i++) {
        if (!board[i][0].equals(" ") && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
          if (movements % 2 == 0 || movements == 0) {
            System.out.println("Player 2 wins Congratulations");
          } else {
            System.out.println("Player 1 wins Congratulations");
          }
          running = false;

        }
      }

      for (int i = 0; i < 3; i++) {
        if (!board[0][i].equals(" ") && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
          if (movements % 2 == 0 || movements == 0) {
            System.out.println("Player 2 wins Congratulations");
          } else {
            System.out.println("Player 1 wins Congratulations");
          }
          running = false;

        }
      }

      if (!board[0][0].equals(" ") && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        if (movements % 2 == 0 || movements == 0) {
          System.out.println("Player 2 wins Congratulations");
        } else {
          System.out.println("Player 1 wins Congratulations");
        }
        running = false;

      }
      

      if (!board[2][0].equals(" ") && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
        if (movements % 2 == 0 || movements == 0) {
          System.out.println("Player 2 wins Congratulations");
        } else {
          System.out.println("Player 1 wins Congratulations");
        }
        running = false;

      }
      
     



    }

  }
}
