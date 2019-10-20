import java.util.Scanner;

public class Exercise31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("💲💲💲 Welcome to Craps game 💲💲💲");
    System.out.print("Enter how much money do you want to bet: ");
    boolean isPlaying = true;
    int bet = sc.nextInt();
    sc.nextLine();
    int dice1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
    int dice2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
    int total = dice1 + dice2;
    System.out.println("Dice 1: " + dice1);
    System.out.println("Dice 2: " + dice2);
    System.out.println("Total: " + total);

    while (isPlaying) {
      if (total == 7 || total == 11) {
        System.out.println("Congratulations you have won " + bet + "€");
        System.out.println("Now you have " + (bet + bet) + "€");
        isPlaying = false;
      } else if (total == 2 || total == 3 || total == 12) {
        System.out.println("You have lost all your money... I'm sorry 😔");
        isPlaying = false;
      } else {
        
        System.out.println("Second stage: ");
        System.out.println("Now you need a " + total + " for winning");
        int newTotal;
        do {
          System.out.println("Press ENTER to play your dices...");
          sc.nextLine();
          dice1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
          dice2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
          newTotal = dice1 + dice2;
          System.out.println("Dice 1: " + dice1);
          System.out.println("Dice 2: " + dice2);
          System.out.println("Total: " + newTotal);
        } while (newTotal != 7 && newTotal != total);
        
        if (newTotal == 7) {
          System.out.println("You have lost all your money... I'm sorry 😔");
          isPlaying = false;
        } else {
          System.out.println("Congratulations you have won " + bet + "€");
          System.out.println("Now you have " + (bet + bet) + "€");
          isPlaying = false;
        }
        
        
      }

    }

  }
}
