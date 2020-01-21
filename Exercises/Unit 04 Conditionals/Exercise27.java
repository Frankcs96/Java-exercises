import java.util.Scanner;

public class Exercise27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Choose a flavour (apple, strawberry or chocolate)");
    String flavour = sc.nextLine();
    double cakePrice = 0;
    String cakeType = "";
    
    if (flavour.equalsIgnoreCase("apple")) {
      cakePrice = 18;
      cakeType = "Apple cake";
    }
    
    if (flavour.equalsIgnoreCase("strawberry")) {
      cakePrice = 16;
      cakeType = "Strawberry cake";
    }
    
    if (flavour.equalsIgnoreCase("chocolate")) {
      System.out.println("Which type of chocolate do you want? (dark or white)");
      String chocolateType = sc.nextLine();
      
      if (chocolateType.contentEquals("dark")) {
        cakePrice = 14;
        cakeType = "Dark chocolate cake";
      }
      
      if (chocolateType.contentEquals("white")) {
        cakePrice = 15;
        cakeType = "White chocolate cake";
      }
      
    }
    
    System.out.println("Would you like cream? (yes or no)");
    String creamOption = sc.nextLine();
    
    boolean withCream = false;
    if (creamOption.equalsIgnoreCase("yes")) {
      withCream = true;
    }
    
    System.out.println("Would you like to custom your cake with your name? (yes or no)");
    String nameOption = sc.nextLine();
    
    boolean withName = false;
    if (nameOption.equalsIgnoreCase("yes")) {
      withName = true;
    }
    
    System.out.printf("%s: %.2f €\n" , cakeType, cakePrice);
    if (withCream) {
      cakePrice += 2.50;
      System.out.println("With cream: 2,50 €");
    }
    
    if (withName) {
      cakePrice += 2.75;
      System.out.println("With name: 2,75 €");
    }
    
    System.out.printf("Total: %.2f €", cakePrice);
          
    
  }
}
