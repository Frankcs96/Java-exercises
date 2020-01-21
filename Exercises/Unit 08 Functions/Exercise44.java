import java.util.Scanner;

public class Exercise44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of the triangle: ");
    int height = sc.nextInt();

    for (int i = 0; i < height; i++) {
      System.out.print(figures.Main.drawLine(' ', i));
      if (i == 0 || i == height - 1) {
        System.out.println(figures.Main.drawLine('*', height - i));
      } else {
        System.out.print(figures.Main.drawLine('*', 1));
        System.out.print(figures.Main.drawLine(' ', height - i - 2));
        System.out.println(figures.Main.drawLine('*', 1));
      }

    }
  }
}
