
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    HashMap<String, Double> prices = new HashMap<>();
    ArrayList<String> productsList = new ArrayList<>();
    ArrayList<Integer> unitsList = new ArrayList<>();
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
        double total = 0;
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");

        for (int i = 0; i < productsList.size(); i++) {
          total += prices.get(productsList.get(i)) * unitsList.get(i);
          System.out.printf("%-7s %7.2f %6d  %7.2f\n", productsList.get(i),
              prices.get(productsList.get(i)), unitsList.get(i),
              prices.get(productsList.get(i)) * unitsList.get(i));

        }
        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f", total);

        running = false;
      } else {
        System.out.print("Cantidad: ");
        int units = Integer.parseInt(sc.nextLine());
        productsList.add(product);
        unitsList.add(units);
      }


    }

  }
}
