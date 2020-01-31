import java.util.Objects;

public class Article {
  private String code;
  private String description;
  private double buyPrice;
  private double sellPrice;
  private int stock;

  public Article(String code, String description, double buyPrice, double sellPrice) {
    this.code = code;
    this.description = description;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.stock = 0;
  }

  public Article(String code, String description, double buyPrice, double sellPrice, int stock) {
    this.code = code;
    this.description = description;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.stock = stock;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(double buyPrice) {
    this.buyPrice = buyPrice;
  }

  public double getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(double sellPrice) {
    this.sellPrice = sellPrice;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "*************************************\n"
        + "Code: " + this.code + "\n"
        + "Description: " + this.description + "\n"
        + "Purchase price: " + this.buyPrice + " $\n"
        + "Sale price: " + this.sellPrice + " $\n"
        + "Stock: " + this.stock + "\n"
        + "*************************************\n\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return code.equals(article.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }
}
