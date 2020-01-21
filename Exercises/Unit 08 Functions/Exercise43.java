import java.util.Scanner;

public class Exercise43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of the triangle: ");
    int height = sc.nextInt();
    
    for (int i = 0; i < height; i++) {
      System.out.print(figures.Main.drawLine(' ', i));
      System.out.println(figures.Main.drawLine('*', height - i));
    }
  }
}
