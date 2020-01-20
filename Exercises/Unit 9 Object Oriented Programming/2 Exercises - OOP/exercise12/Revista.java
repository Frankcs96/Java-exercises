public class Revista extends Publicacion {

  private int numero;
  public Revista(String isbn, String titulo, int agnoPubli, int numero) {
    super(isbn, titulo, agnoPubli);
    this.numero = numero;
  }
}
