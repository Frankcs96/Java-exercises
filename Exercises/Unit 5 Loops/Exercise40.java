import java.util.Scanner;

public class Exercise40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = 0;  
    
    do {
      System.out.println("Please enter the height of the diamond: ");
      System.out.println("remember it has to be an odd number and >= 3");
      height = sc.nextInt();
      if ((height < 3) || (height % 2 == 0)) {
        System.out.println("Wrong input.... try again");
      }
      
    } while (height < 3 || height % 2 == 0);
    
    
    
    
  }
  
}