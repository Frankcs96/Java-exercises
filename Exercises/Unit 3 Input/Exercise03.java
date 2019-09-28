import java.util.Scanner;


public class Exercise03 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert an amount in pesetas");
    double pesetas = sc.nextDouble();
    
    double euros = pesetas/166.386;
    
    System.out.println("Exchanging...");
    
    System.out.println("You have " + euros + " euros");
  }
}

