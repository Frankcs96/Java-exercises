import java.util.Scanner;

public class Exercise15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a char for drawing the pyramid");
    String c = sc.nextLine();
    
    System.out.println("Vertex pointing to? (choose a number)");
    System.out.println("1. North\n2. East\n3. West\n4. South");
    int choice = sc.nextInt();
    
    if (choice == 1) {
      System.out.println("  " + c );
      System.out.println(" " + c + c + c);
      System.out.println(c + c + c + c + c);
    }
    
    if (choice == 2) {
      System.out.println(c);
      System.out.println(c + " " + c);
      System.out.println(c + " " + c + " " + c);
      System.out.println(c + " " + c);
      System.out.println(c);
      
    }
    
    if (choice == 3) {
      System.out.println("    " + c);
      System.out.println("  " + c + " " + c);
      System.out.println(c + " " + c + " " + c);
      System.out.println("  " + c + " " + c);
      System.out.println("    " + c);
      
    }
    
    if (choice == 4) {
      System.out.println(c + c + c + c + c);
      System.out.println(" " + c + c + c);
      System.out.println("  " + c);
    }
    
  }
}
