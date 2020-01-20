public class Piramide {

  private int altura;
  private static int piramidesCreadas;

  public Piramide(int altura) {
    this.altura = altura;
    piramidesCreadas++;
  }

  public static int getPiramidesCreadas() {
    return piramidesCreadas;
  }

  @Override
  public String toString() {
    String piramide = "";

    for (int i = 1; i <= this.altura; i++) {

      for (int j = 0; j < this.altura - i; j++) {
        piramide += " ";
      }

      for (int j = 0; j < i * 2 - 1; j++) {
        piramide += "*";
      }
      piramide += "\n";
    }

    return piramide;
  }
}
