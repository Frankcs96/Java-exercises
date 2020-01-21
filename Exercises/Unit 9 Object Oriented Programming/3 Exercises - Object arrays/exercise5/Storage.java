public class Storage {

  private Article[] articles;

  public Storage(int arraySize) {
    this.articles = new Article[arraySize];
  }

  public void showList() {
    for (Article article : articles) {
      if (article != null) {
        System.out.println(article);
      }
    }
  }

  public void registerProduct(Article article) {

    if (isArticleInside(article.getCode())) {
      System.out.println("Error, article with same code detected.");
    } else {
      //check first free position
      int i = 0;
      while (articles[i] != null) {
        i++;
      }
      articles[i] = article;
    }


  }

  public void deleteProduct(String code) {
    if (isArticleInside(code)) {
      //look for article position for delete
      int i = 0;
      if (articles[i] != null && !articles[i].getCode().equalsIgnoreCase(code)) {
        i++;
      }
      articles[i] = null;
      System.out.println("Article deleted");

    } else {
      System.out.println("Article not found with that code");
    }
  }

  public void updateProduct(String code, String desc, String buyPrice, String sellPrice) {
    if (isArticleInside(code)) {
      int i = 0;
      if (articles[i] != null && !articles[i].getCode().equalsIgnoreCase(code)) {
        i++;
      }
      if (!desc.equalsIgnoreCase("")) {
        articles[i].setDescription(desc);
      }

      if (!buyPrice.equalsIgnoreCase("")) {
        articles[i].setBuyPrice(Double.parseDouble(buyPrice));
      }

      if (!sellPrice.equalsIgnoreCase("")) {
        articles[i].setSellPrice(Double.parseDouble(sellPrice));
      }
      System.out.println("Article updated");

    } else {
      System.out.println("Article not found with that code");
    }
  }

  public void addStock(String code, int n) {
    if (isArticleInside(code)) {
      int i = 0;
      if (articles[i] != null && !articles[i].getCode().equalsIgnoreCase(code)) {
        i++;
      }
      int actualUnits = articles[i].getStock();
      articles[i].setStock(actualUnits += n);
      System.out.println("Stock updated");
    } else {
      System.out.println("Article not found with that code");
    }
  }

  public void subtractStock(String code, int n) {
    if (isArticleInside(code)) {
      int i = 0;
      if (articles[i] != null && !articles[i].getCode().equalsIgnoreCase(code)) {
        i++;
      }
      int actualUnits = articles[i].getStock();
      if (actualUnits >= n) {
        articles[i].setStock(actualUnits -= n);
        System.out.println("Stock updated");
      } else {
        System.out.println("You dont have that much units");
      }

    } else {
      System.out.println("Article not found with that code");
    }
  }
  
  private boolean isArticleInside(String code) {
    for (Article art : articles) {
      if (art != null) {
        if (art.getCode().equalsIgnoreCase(code)) {
          return true;
        }
      }
    }
    return false;
  }

}
