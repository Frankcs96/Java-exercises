public class Libro extends Publicacion implements Prestable{
  private boolean prestado;

  public Libro(String isbn, String titulo, int agnoPubli) {
    super(isbn, titulo, agnoPubli);
    this.prestado = false;
  }

  @Override
  public void presta() {
    this.prestado = true;
  }

  @Override
  public void devuelve() {
    this.prestado = false;
  }

  @Override
  public boolean estaPrestado() {
    return this.prestado;
  }

  @Override
  public String toString() {
    if (this.prestado) {
      return super.toString() + " (" + "prestado)";
    } else {
      return super.toString() + " (" + "no prestado)";
    }

  }
}
