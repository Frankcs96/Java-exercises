import java.util.Scanner;

public class Exercise27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
 
    System.out.print("Player turn (enter rock, paper , scissor): ");
    String player = sc.nextLine();
    
    if (!player.equalsIgnoreCase("rock") && !player.equalsIgnoreCase("paper") &&
        !player.equalsIgnoreCase("scissor")) {
      
      System.out.println("Wrong input...");
    } else {
    
      int random = (int)(Math.random() * ((3 - 1) + 1)) + 1;
      String computer = "";
      
      if (random == 1) {
        computer = "rock";
      }
      
      if (random == 2) {
        computer = "paper";
      }
      
      if (random == 3) {
        computer = "scissor";
        
      }
      
      System.out.println("Computer turn: " + computer);
      
      if (player.equalsIgnoreCase(computer)) {
        System.out.println("Draw...");
      }
      
      if (player.equalsIgnoreCase("rock") && computer.equals("paper")) {
        System.out.println("Computer wins");
      }
      
      if (player.equalsIgnoreCase("rock") && computer.equals("scissor")) {
        System.out.println("Player wins");
      }
      
      if (player.equalsIgnoreCase("paper") && computer.equals("rock")) {
        System.out.println("Player wins");
      }
      
      if (player.equalsIgnoreCase("paper") && computer.equals("scissor")) {
        System.out.println("Computer wins");
      }
      
      if (player.equalsIgnoreCase("scissor") && computer.equals("rock")) {
        System.out.println("Computer wins");
      }
      
      if (player.equalsIgnoreCase("scissor") && computer.equals("paper")) {
        System.out.println("Player wins");
      }
      
      
        
      
      
    }
     
        
    
    
  }
}
