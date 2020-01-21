


public class Exercise06 {

  public static void main (String[] args) {

   double taxBase= 43.35;
   double totalPrice = taxBase + taxBase * 21 / 100;
   
   System.out.println("Tax base: " + taxBase + " euros");
   System.out.println("Total price: " + Math.round(totalPrice * 100) / 100D + " euros");
  }
}

