import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    Storage storage = new Storage();


    while (running) {

      System.out.println("\n\nGESTISIMAL");
      System.out.println("=====================");
      System.out.println("1. Show List");
      System.out.println("2. Register product");
      System.out.println("3. Delete product");
      System.out.println("4. Update product");
      System.out.println("5. Add stock");
      System.out.println("6. Buy Article");
      System.out.println("7. Exit");
      System.out.print("Enter an option: ");
      int option = sc.nextInt();
      sc.nextLine();

      switch (option) {

        case 1:
          storage.showList();
          break;
        case 2:
          System.out.print("Enter article code: ");
          String code = sc.nextLine();

          System.out.print("Enter article description: ");
          String description = sc.nextLine();

          System.out.print("Enter article purchase price: ");
          double buyPrice = sc.nextDouble();
          sc.nextLine();

          System.out.print("Enter article sale price: ");
          double salePrice = sc.nextDouble();
          sc.nextLine();
          storage.registerProduct(new Article(code, description, buyPrice, salePrice));
          break;

        case 3:
          System.out.print("Enter article's code that you want to delete: ");
          String codeToDelete = sc.nextLine();
          storage.deleteProduct(codeToDelete);
          break;
        case 4:
          System.out.print("Enter article's code that you want to update: ");
          String codeToUpdate = sc.nextLine();

          System.out.print("Enter article description or press enter to continue: ");
          String descriptionToUpdate = sc.nextLine();

          System.out.print("Enter article purchase price or press enter to continue: ");
          String buyPriceToUpdate = sc.nextLine();

          System.out.print("Enter article sale price or press enter to continue: ");
          String salePriceToUpdate = sc.nextLine();

          storage.updateProduct(codeToUpdate, descriptionToUpdate, buyPriceToUpdate,
              salePriceToUpdate);
          break;
        case 5:
          System.out.print("Enter article's code that you want to add stock: ");
          String codeToAddStock = sc.nextLine();
          System.out.print("How many units would you like to add?: ");
          int units = sc.nextInt();
          sc.nextLine();
          storage.addStock(codeToAddStock, units);
          break;
        case 6:
          storage.sell();
          break;
        case 7:
          System.out.println("Have a nice day!");
          running = false;
          break;
        default:
          System.out.println("Wrong option");

      }

    }
  }
}
