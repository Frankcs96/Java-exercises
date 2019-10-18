import java.util.Scanner;

public class Exercise67 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberSteps = 0;
    int height = 0;
    int counter = 0;
    int width = 4;
    
    System.out.println("Enter the number of steps: ");
    numberSteps = sc.nextInt();
    System.out.println("Enter the height of each one");
    height = sc.nextInt();
    
    for (int i = 0; i < height * numberSteps; i++) {
      
      for (int j = 0; j < width; j++) {
        System.out.print("*");
        
      }
      System.out.println();
      counter++;
      if (counter == height) {
        width += 4;
        counter = 0;
      }
    }
  }
}
