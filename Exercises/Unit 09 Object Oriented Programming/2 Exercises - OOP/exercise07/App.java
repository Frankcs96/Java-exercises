import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    boolean running = true;

    while (running) {
      System.out.println("Eliga una opcion: ");
      System.out.println("1.Mostrar número de entradas.");
      System.out.println("2.Vender entradas.");
      System.out.println("3.Salir");

      int userOption = sc.nextInt();

      switch (userOption) {
        case 3:
          System.out.println("Tenga un buen dia");
          running = false;
          break;
        case 2:
          System.out.println("De que zona quiere comprar las entradas");
          System.out.println("1. Zona principal");
          System.out.println("2. Zona compra-venta");
          System.out.println("3. Zona VIP");
          int zone = sc.nextInt();
          System.out.print("Cuantas entradas quiere: ");
          int numberTickets = sc.nextInt();
          if (zone == 1) {
              principal.vender(numberTickets);
            }

          if (zone == 2) {
            compraVenta.vender(numberTickets);
          }

          if (zone == 3) {
            vip.vender(numberTickets);
          }

          break;
        case 1:
          System.out.println("Zona principal -> " + principal.getEntradasPorVender());
          System.out.println("Zona compra-venta -> " + compraVenta.getEntradasPorVender());
          System.out.println("Zona VIP -> " + vip.getEntradasPorVender());
      }
    }
  }
}
