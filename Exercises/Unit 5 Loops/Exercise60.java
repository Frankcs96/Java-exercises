import java.util.Scanner;

public class Exercise60 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter the height of the socks (minimum 4)");
    int height = 0;
    do {
      height = sc.nextInt();
      if (height < 4) {
        System.out.println("Wrong input... try again");
      }
    } while (height < 4);
    
    for (int i = 0; i < height - 2; i++) {
      
      System.out.print("***     ***");
      System.out.println();
    }
    

    for (int i = 0; i < 2; i++) {
      
      System.out.print("******  ******");     
      System.out.println();
    }
    
    
  }
  
}