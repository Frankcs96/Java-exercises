import java.util.Scanner;

public class Exercise46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of the figure: ");
    int height = sc.nextInt();
    
    for (int i = 1; i < height; i++) {
      
      System.out.print(borders('*', i));
      System.out.print(figures.Main.drawLine(' ', height * 2 - i * 2 - 1));
      System.out.println(borders('*', i));   
     
    }
    
    System.out.println(figures.Main.drawLine('*', height * 2 - 1));
    
    
  }
  
  
  public static String borders(char charac, int size) {

    if (size == 1) {
      return charac + "";
    }

    return charac + figures.Main.drawLine(' ', size - 2) + charac;
  }
}
