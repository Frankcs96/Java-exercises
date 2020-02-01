
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    HashMap<String, Double> prices = new HashMap<>();
    HashMap<String, Integer> productList = new HashMap<>();

    prices.put("avena", 2.21);
    prices.put("garbanzos", 2.39);
    prices.put("tomate", 1.59);
    prices.put("jengibre", 3.13);
    prices.put("quinoa", 4.50);
    prices.put("guisantes", 1.60);

    System.out.println("Introduzca fin para finalizar la compra: ");
    while (running) {
      System.out.print("Producto: ");
      String product = sc.nextLine();
      if (product.equalsIgnoreCase("fin")) {
        boolean discount = false;
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        if (sc.nextLine().equals("ECODTO")) {
          discount = true;
        }
        double total = 0;
        double discountToSubtract = 0;
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");

        for (String s : productList.keySet()) {
          total += productList.get(s) * prices.get(s);
          System.out.printf("%-7s %7.2f %6d  %7.2f\n", s, prices.get(s), productList.get(s),
              productList.get(s) * prices.get(s));
        }

        if (discount) {
          discountToSubtract = total * 0.10;
          total -= discountToSubtract;
        }
        System.out.println("---------------------------------");
        System.out.printf("Descuento: %.2f\n", discountToSubtract);

        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f", total);

        running = false;
      } else {
        System.out.print("Cantidad: ");
        int units = Integer.parseInt(sc.nextLine());
        if (productList.containsKey(product)) {
          productList.put(product, productList.get(product) + units);
        } else {
          productList.put(product, units);
        }

      }


    }

  }
}
