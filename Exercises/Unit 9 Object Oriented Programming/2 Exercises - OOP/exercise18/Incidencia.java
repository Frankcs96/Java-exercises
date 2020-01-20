public class Incidencia {

  private static int pendientes;

  private int codigo;
  private boolean estaPendiente;
  private int numeroPuesto;
  private String info;
  private String infoResuelto;

  public Incidencia(int numeroPuesto, String info) {
    this.numeroPuesto = numeroPuesto;
    this.info = info;
    this.estaPendiente = true;
    Incidencia.pendientes++;
    this.codigo = Incidencia.pendientes;

  }

  public void resuelve(String mensaje) {
    Incidencia.pendientes--;
    this.estaPendiente = false;
    this.infoResuelto = mensaje;

  }

  public static int getPendientes() {
    return pendientes;
  }

  @Override
  public String toString() {
    if (this.estaPendiente) {
      return "Incidencia " + this.codigo + " - " + "Puesto: " + this.numeroPuesto + " - "
          + this.info + " - " + "Pendiente";
    }
    return "Incidencia " + this.codigo + " - " + "Puesto: " + this.numeroPuesto + " - "
        + this.info + " - " + "Resuelta" + " - " + this.infoResuelto;

  }
}
