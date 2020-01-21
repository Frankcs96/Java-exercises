import java.util.Scanner;

public class Exercise45 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of the figure: ");
    int height = sc.nextInt();
    
    for (int i = 0; i < height; i++) {
      
      System.out.print(figures.Main.drawLine('*', i + 1));
      System.out.print(figures.Main.drawLine(' ', (height * 2 - 3) - i * 2));
      
      if (i == height - 1) {
        System.out.println(figures.Main.drawLine('*', height - 1));
      } else {
        System.out.println(figures.Main.drawLine('*', i + 1));
      }
      
     
    }
  }
}
