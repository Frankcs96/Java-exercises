import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the bishop's position: ");
    String userOption = sc.nextLine();

    int col = (char) userOption.charAt(0) - 96;
    int row = Integer.parseInt(userOption.charAt(1) + "");
    int x = col;
    int y = row;
    System.out.print("The bishop can move to the following positions:");

    while ((x > 1 && y > 1)) {
      x--;
      y--;
      System.out.print(" " + (char)(x + 96) + (y));
      
    }
    
    x = col;
    y = row;
    while ((x < 8 && y < 8)) {
      x++;
      y++;
      System.out.print(" " + (char)(x + 96) + (y));
      
    }
    
    x = col;
    y = row;
    while ((x > 1 && y < 8)) {
      x--;
      y++;
      System.out.print(" " + (char)(x + 96) + (y));
      
    }
    
    x = col;
    y = row;
    while ((x < 8 && y > 1)) {
      x++;
      y--;
      System.out.print(" " + (char)(x + 96) + (y));
      
    }
    
    
  }
}
