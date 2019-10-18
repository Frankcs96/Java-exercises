import java.util.Scanner;

public class Exercise20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Please, enter the capacity of the container in liters: ");
    int height = sc.nextInt();
    
    int randomCap = (int)(Math.random() * ((height - 0) + 1)) + 0;

    System.out.println(randomCap);
    for (int i = height; i >= 0; i--) {
      
      for (int j = 1; j <= 6; j++) {
        if (i == 0 || j == 1 || j == 6) {
          System.out.print("*");
        } else {
          if (i <= randomCap) {
            System.out.print("=");
          } else {
            System.out.print(" ");
          }
         
        }
       
      }
      
      System.out.println();
    }
    System.out.println("The container has the capacity of " + height + " liters");
    System.out.println("and it's fill with " + randomCap + " liters of water");
  }
}
