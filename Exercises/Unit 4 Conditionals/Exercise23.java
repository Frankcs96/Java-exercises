import java.util.Scanner;

public class Exercise23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the tax base: ");
    double taxBase = sc.nextDouble();
    sc.nextLine();
    
    System.out.println("Enter VAT type (standard, reduced or superreduced): ");
    String vatType = sc.nextLine();
    int vat = 0;
    if (vatType.equals("standard")) {
      vat = 21;
    }
    
    if (vatType.equals("reduced")) {
      vat = 10;
    }
    
    if (vatType.equals("superreduced")) {
      vat = 4;
    }
    double totalPrice = taxBase + taxBase * vat / 100;
    
    
    
    System.out.println("Enter promotion code (nopro, half, minus5 or 5perc)");
    String promotionCode = sc.nextLine();
    double discount = 0;
    if (promotionCode.equals("nopro")) {
      discount = -0;
    }
    
    if (promotionCode.equals("half")) {
      discount = totalPrice / 2;
    }
    
    if (promotionCode.equals("minus5")) {
      discount = 5;
    }
    
    if (promotionCode.equals("5perc")) {
      discount = totalPrice * 5 / 100;
    } else {
      System.out.println("Wrong promotion code");
    }
    
    
    System.out.printf("Tax base %15.2f\n" , taxBase);
    System.out.printf("VAT (%d%%) %14.2f\n" , vat , (taxBase * vat) / 100);
    System.out.printf("Price with VAT %9.2f\n", totalPrice);
    System.out.printf("Prom. code (%2s) -%5.2f\n" , promotionCode , discount);
    System.out.println("-----------------------------------------");
    System.out.printf("TOTAL %18.2f" , totalPrice-discount);
  }
}
