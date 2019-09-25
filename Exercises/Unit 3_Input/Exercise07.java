import java.util.Scanner;


public class Exercise07 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca la base imponible del producto");
    double baseImponible = sc.nextDouble();
    double precioTotal = baseImponible + baseImponible*21/100;
   
    System.out.println("Base imponible: " + baseImponible);
    System.out.println("Precio total: " + precioTotal);
  }
}

