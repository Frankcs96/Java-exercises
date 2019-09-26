import java.util.Scanner;


public class Exercise02 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert an amount in euros");
    double euros = sc.nextDouble();
    
    double pesetas = euros * 166.386;
    
    System.out.println("Exchanging...");
    
    System.out.println("You have " + (int)pesetas + " pesetas");
  }
}

