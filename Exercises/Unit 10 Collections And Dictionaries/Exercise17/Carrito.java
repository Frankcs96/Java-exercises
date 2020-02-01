import java.util.ArrayList;

public class Carrito {

  private ArrayList<Elemento> shopList;

  public Carrito() {
    shopList = new ArrayList<>();
  }


  public void agrega(Elemento elemento) {
    this.shopList.add(elemento);

  }

  public int numeroDeElementos() {
    return this.shopList.size();
  }

  public double importeTotal() {
    double total = 0;
    for (Elemento elemento : shopList) {
      total += elemento.getPrice() * elemento.getUnits();
    }
    return total;
  }

  @Override
  public String toString() {
    String text = "Contenido del carrito\n"
        + "=====================\n";
    for (Elemento elemento : shopList) {
      text += elemento.toString() + "\n";
    }
    return text;
  }
}
