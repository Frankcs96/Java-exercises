public class FichaDomino {

  private int lado1;
  private int lado2;

  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  @Override
  public String toString() {
    String lado1 = this.lado1 + "";
    String lado2 = this.lado2 + "";

    if (this.lado1 == 0) {
      lado1 = " ";
    }

    if (this.lado2 == 0) {
      lado2 = " ";
    }

    return "[" + lado1 + "|" + lado2 + "]";

  }

  public FichaDomino voltea() {
    return new FichaDomino(this.lado2, this.lado1);
  }

  public boolean encaja(FichaDomino ficha) {
    return (this.lado1 == ficha.lado1) || (this.lado1 == ficha.lado2) ||
        (this.lado2 == ficha.lado1) || (this.lado2 == ficha.lado2);

  }
}

