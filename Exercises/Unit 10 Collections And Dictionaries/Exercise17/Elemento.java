import java.text.DecimalFormat;

public class Elemento {

  private String productName;
  private double price;
  private int units;

  public Elemento(String productName, double price, int units) {
    this.productName = productName;
    this.price = price;
    this.units = units;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }

  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("0.00");
    return this.productName + " PVP: " + df.format(this.price) + " Unidades: " + this.units
        + " Subtotal: "
        + df.format(this.price * this.units);
  }
}
