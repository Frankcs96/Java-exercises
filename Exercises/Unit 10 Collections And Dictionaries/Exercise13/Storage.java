
import java.util.ArrayList;
import java.util.Scanner;


public class Storage {

  private ArrayList<Article> articles;

  public Storage() {
    this.articles = new ArrayList<>();
    articles.add(new Article("1", "Hammer", 20, 30, 15));
    articles.add(new Article("2", "Ring", 341, 640, 10));
    articles.add(new Article("3", "Printer", 32, 54, 100));
  }

  public void showList() {
    for (Article article : articles) {
      System.out.println(article);
    }
  }

  public void registerProduct(Article article) {

    if (articles.contains(article)) {
      System.out.println("Error, article with same code detected.");
    } else {

      articles.add(article);
    }


  }

  public void deleteProduct(String code) {
    if (articles.contains(new Article(code, "", 0, 0))) {
      articles.removeIf(article -> article.getCode().equalsIgnoreCase(code));
    } else {
      System.out.println("Article not found with that code");
    }
  }

  public void updateProduct(String code, String desc, String buyPrice, String sellPrice) {
    if (articles.contains(new Article(code, "", 0, 0))) {

      if (!desc.equalsIgnoreCase("")) {
        int index = articles.indexOf(new Article(code, "", 0, 0));
        articles.get(index).setDescription(desc);
      }

      if (!buyPrice.equalsIgnoreCase("")) {
        int index = articles.indexOf(new Article(code, "", 0, 0));
        articles.get(index).setBuyPrice(Double.parseDouble(buyPrice));
      }

      if (!sellPrice.equalsIgnoreCase("")) {
        int index = articles.indexOf(new Article(code, "", 0, 0));
        articles.get(index).setSellPrice(Double.parseDouble(sellPrice));
      }
      System.out.println("Article updated");

    } else {
      System.out.println("Article not found with that code");
    }
  }

  public void addStock(String code, int n) {
    if (articles.contains(new Article(code, "", 0, 0))) {
      int index = articles.indexOf(new Article(code, "", 0, 0));
      int actualUnits = articles.get(index).getStock();
      articles.get(index).setStock(actualUnits += n);
      System.out.println("Stock updated");
    } else {
      System.out.println("Article not found with that code");
    }
  }

  public void sell() {
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    ArrayList<Article> shopList = new ArrayList<>();
    while (running) {
      System.out.println("1.Buy an article");
      System.out.println("2.Print your bill");
      System.out.println("3.Go to main menu");
      int option = Integer.parseInt(sc.nextLine());

      switch (option) {
        case 1:
          System.out.println("Enter article's code that you want to buy");
          String code = sc.nextLine();
          if (articles.contains(new Article(code, "", 0, 0))) {
            System.out.println("Enter how many units: ");
            int unitsToBuy = Integer.parseInt(sc.nextLine());
            int index = articles.indexOf(new Article(code, "", 0, 0));
            if (articles.get(index).getStock() >= unitsToBuy) {
              shopList.add(new Article(code, articles.get(index).getDescription(),
                  articles.get(index).getBuyPrice(), articles.get(index).getSellPrice(),
                  unitsToBuy));

            } else {
              System.out.println("We don't have that much units");
            }
          } else {
            System.out.println("Article not found");
          }
          break;
        case 2:
          double priceWithoutIva = 0;
          System.out.printf(" %6s | %15s | %8s | %12s | %8s\n", "CODE", "DESCRIPTION", "UNITS",
              "UNIT PRICE", "TOTAL");
          System.out.println("----------------------------------------------------------------");
          for (Article article : shopList) {
            System.out.printf(" %6s | %15s | %8d | %12.2f | %8.2f\n", article.getCode(),
                article.getDescription(), article.getStock(), article.getSellPrice(),
                article.getSellPrice() * article.getStock());
            priceWithoutIva += article.getSellPrice() * article.getStock();
            int index = articles.indexOf(new Article(article.getCode(), "", 0, 0));
            int actualUnits = articles.get(index).getStock();
            articles.get(index).setStock(actualUnits -= article.getStock());
          }

          System.out.println("----------------------------------------------------------------");
          System.out.printf("                                               TOTAL: %8.2f \n",
              priceWithoutIva * 1.21);

          running = false;
          break;
        case 3:
          running = false;
          break;
        default:
          System.out.println("Wrong option");
      }


    }
  }


}
