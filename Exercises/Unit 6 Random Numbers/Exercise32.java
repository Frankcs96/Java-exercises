import java.util.Scanner;

public class Exercise32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the lenght of the path: ");
    int height = sc.nextInt();
    int spaces = 6;
    int direction = 0;
    boolean isObstacle;
    int randomObstacle;
    int positionRandom;
    String character = "";

    for (int i = 0; i < height; i++) {
      if (i != 0) {
        direction = (int)(Math.random() * ((1 - (-1)) + 1)) + (-1);
        spaces += direction;
      }
      
      randomObstacle = (int)(Math.random() * ((2 - 1) + 1)) + 1;
      isObstacle = false;
      if (randomObstacle == 1) {
        isObstacle = true;
        int randomChar = (int)(Math.random() * ((2 - 1) + 1)) + 1;
        if (randomChar == 1) {
          character = "*";
        } else {
          character = "O";
        }
      }
      
      positionRandom = (int)(Math.random() * ((4 - 1) + 1)) + 1;

      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
        
      }
      
      System.out.print("|");
      for (int j = 1; j <= 4; j++) {
        if (isObstacle && j == positionRandom) {
          System.out.print(character);
        } else {
          System.out.print(" ");
        }
      }
      
      System.out.print("|");
      System.out.println();
    }

  }
}
