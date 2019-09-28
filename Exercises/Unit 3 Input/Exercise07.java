import java.util.Scanner;


public class Exercise07 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter the tax base of the product");
    double taxBase = sc.nextDouble();
    double totalPrice = taxBase + taxBase * 21 / 100;
   
    System.out.println("Tax base: " + taxBase + " euros");
    System.out.println("Total price: " + Math.round(totalPrice*100) / 100D + " euros");
  }
}

