import java.util.Scanner;

public class Exercise29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("What have you taken for eat? (palmera , donut or pitufo): "); //spanish food
    String forEat = sc.nextLine();
    double foodPrice = 0;
    
    if (forEat.equalsIgnoreCase("palmera")) {
      foodPrice = 1.40;
    }
    
    if (forEat.equalsIgnoreCase("donut")) {
      foodPrice = 1;
    }
    String pitufoWith = "";
    if (forEat.equalsIgnoreCase("pitufo")) {
      System.out.println("pitufo with... (oil or omelette)");
      pitufoWith = sc.nextLine();
      
      if (pitufoWith.equalsIgnoreCase("oil")) {
        foodPrice = 1.20;
      }
      
      if (pitufoWith.equalsIgnoreCase("omelette")) {
        foodPrice = 1.60;
      }
    }
    
    System.out.println("What have you taken for drink? (juice or coffee): ");
    String forDrink = sc.nextLine();
    double drinkPrice = 0;
    if (forDrink.equalsIgnoreCase("juice")) {
      drinkPrice = 1.50;
    }
    
    if (forDrink.equalsIgnoreCase("coffee")) {
      drinkPrice = 1.20;
    }
    
    
    if(forEat.equalsIgnoreCase("pitufo")) {
      System.out.printf("%s with %s: %.2f €\n" , forEat, pitufoWith, foodPrice);
    } else {
      System.out.printf("%s: %.2f €\n" , forEat, foodPrice);
    }
    System.out.printf("%s: %.2f €\n" , forDrink, drinkPrice);
    System.out.printf("Total: %.2f €\n" , foodPrice + drinkPrice);
    
    
  }
}
