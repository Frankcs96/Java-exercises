import java.util.Scanner;

public class Exercise25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter flag height");
    double height = sc.nextDouble();
    sc.nextLine();
    
    System.out.println("Enter flag width");
    double width = sc.nextDouble();
    sc.nextLine();
    
    double flagArea = height * width;
    
    
    System.out.println("Do you want a shield on it? (y/n)");
    String option = sc.nextLine().toLowerCase();
    double shieldPrice = 0;
    if (option.equals("y")) {
      shieldPrice = 2.50;
    }
    
    
    double totalPrice = flagArea / 100 + shieldPrice + 3.25;
    
    System.out.println("Thank you here is your purchase.");
    System.out.printf("%.2fcm2 flag:       %10.2f€\n" , flagArea , flagArea / 100);
    if (option.equals("n")) {
      System.out.println("Without shield:             0,00€");
    } else {
      System.out.println("With shield:                2,50€");
    }
    System.out.println("Shipping costs:             3,25€");
    System.out.printf("Total:                %10.2f€\n" , totalPrice);
    
    
  }
}
