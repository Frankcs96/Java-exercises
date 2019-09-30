import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Player 1 turn (enter rock, paper , scissor): ");
    String player1 = sc.nextLine();
    
    System.out.println("Player 2 turn (enter rock, paper , scissor): ");
    String player2 = sc.nextLine();
    
    if (player1.equalsIgnoreCase(player2)) {
      System.out.println("tie!");
    }
    
      else if ((player1.equalsIgnoreCase("rock")) && (player2.equalsIgnoreCase("paper"))) {
      System.out.println("Player 2 wins");
    }
    
      else if ((player1.equalsIgnoreCase("rock")) && (player2.equalsIgnoreCase("scissor"))) {
      System.out.println("Player 1 wins");
    }
    
      else if ((player1.equalsIgnoreCase("paper")) && (player2.equalsIgnoreCase("rock"))) {
      System.out.println("Player 1 wins");
    }
    
      else if ((player1.equalsIgnoreCase("paper")) && (player2.equalsIgnoreCase("scissor"))) {
      System.out.println("Player 2 wins");
    }
    
      else if ((player1.equalsIgnoreCase("scissor")) && (player2.equalsIgnoreCase("rock"))) {
      System.out.println("Player 2 wins");
    }
    
      else if ((player1.equalsIgnoreCase("scissor")) && (player2.equalsIgnoreCase("paper"))) {
      System.out.println("Player 1 wins");
    } else {
        System.out.println("ERROR: Wrong input");
    }
  }
}
