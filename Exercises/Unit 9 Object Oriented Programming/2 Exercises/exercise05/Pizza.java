public class Pizza {

  private String tamano;
  private String tipo;
  private boolean estaServida;
  private static int totalServidas;
  private static int totalPedidas;


  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estaServida = false;
    Pizza.totalPedidas++;
  }

  public void sirve() {
    if (!this.estaServida) {
      this.estaServida = true;
      Pizza.totalServidas++;
      
    } else {
      System.out.println("Esta pizza ya se ha servido");
    }

  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  @Override
  public String toString() {
    if (this.estaServida) {
      return "Pizza " + this.tipo + " " + this.tamano + ", servida";
    } else {
      return "Pizza " + this.tipo + " " + this.tamano + ", pedida";
    }

  }
}
