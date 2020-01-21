public class Linea {
  private Punto primerPunto;
  private Punto segundoPunto;

  public Linea(Punto primerPunto, Punto segundoPunto) {
    this.primerPunto = primerPunto;
    this.segundoPunto = segundoPunto;
  }

  @Override
  public String toString() {
    return "Línea formada por los puntos " + this.primerPunto + " y " + this.segundoPunto;
  }
}
