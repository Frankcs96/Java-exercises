import java.util.Scanner;

public class Exercise22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please, enter the lenght of the snake. (head included): ");
    int lenght = sc.nextInt();
    int random;
    int min = 11;
    int max = 13;
    for (int i = 1; i <= lenght; i++) {
      
      random = (int)(Math.random() * ((max - min) + 1)) + min;
      
      if (i == 1) {
        for (int j = 1; j <= 12; j++) {
          System.out.print(" ");
        }
      } else {
        
        for (int j = 1; j <= random; j++) { // 13 //11 
          System.out.print(" ");
          min = random - 1;
          max = random + 1;
        }
      }
     
      
      
      if (i == 1) {
        System.out.print("@");
      } else {
        System.out.print("*");
      }
      
      System.out.println();
      
    }
  }
}
