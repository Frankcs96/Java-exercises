import java.awt.Point;
import java.util.Scanner;

public class Exercise30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter the height of the aquarium (min 4): ");
    int height = sc.nextInt();
    System.out.print("Please enter the width of the aquarium (min 4): ");
    int width = sc.nextInt();
    int area = height * width;
    int seaHorseWidth = (int) (Math.random() * (((width - 1) - 2) + 1)) + 2;
    int seaHorseHeight = (int) (Math.random() * (((height - 1) - 2) + 1)) + 2;
    int conchWidth = (int) (Math.random() * (((width - 1) - 2) + 1)) + 2;
    int conchHeight = (int) (Math.random() * (((height - 1) - 2) + 1)) + 2;
    int fishWidth = (int) (Math.random() * (((width - 1) - 2) + 1)) + 2;
    int fishHeight = (int) (Math.random() * (((height - 1) - 2) + 1)) + 2;

    while (seaHorseWidth == conchWidth && seaHorseHeight == conchHeight) {
      conchWidth = (int) (Math.random() * (((width - 1) - 2) + 1)) + 2;
      conchHeight = (int) (Math.random() * (((height - 1) - 2) + 1)) + 2;
    }

    while (seaHorseWidth == fishWidth && seaHorseHeight == fishHeight
        || conchWidth == fishWidth && conchHeight == fishHeight) {
      fishWidth = (int) (Math.random() * (((width - 1) - 2) + 1)) + 2;
      fishHeight = (int) (Math.random() * (((height - 1) - 2) + 1)) + 2;
    }


    for (int i = 1; i <= height; i++) {

      for (int j = 1; j <= width; j++) {
        if (i == height || i == 1 || j == 1 || j == width) {
          System.out.print("*");
        } else if (i == seaHorseHeight && j == seaHorseWidth) {
          System.out.print("$");
        } else if (i == conchHeight && j == conchWidth) {
          System.out.print("@");
        } else if (i == fishHeight && j == fishWidth) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }

      }

      System.out.println();
    }

  }
}
