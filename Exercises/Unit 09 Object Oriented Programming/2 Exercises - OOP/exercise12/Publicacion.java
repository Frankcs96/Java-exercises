public abstract class Publicacion {

  private String isbn;
  private String titulo;
  private int agnoPubli;

  public Publicacion(String isbn, String titulo, int agnoPubli) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.agnoPubli = agnoPubli;
  }

  @Override
  public String toString() {
    return "ISBN: " + this.isbn + ", titulo: " + this.titulo + ", año de publicacion: "
        + this.agnoPubli;
  }
}
