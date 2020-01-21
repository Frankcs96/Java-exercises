import java.text.DecimalFormat;

public class Movil extends Terminal {

  private String tarifa;
  private double pago;

  public Movil(String number, String tarifa) {
    super(number);
    this.tarifa = tarifa;
    this.pago = 0;
  }

  public void llama(Movil movil, int time) {

    super.llama(movil , time);

    if (this.tarifa.equals("rata")) {
      this.pago += 0.1 * time / 100;

    }

    if (this.tarifa.equals("mono")) {
      this.pago += 0.2 * time / 100;
    }

    if (this.tarifa.equals("bisonte")) {
      this.pago += 0.5 * time / 100;
    }
  }

  @Override
  public String toString() {
    DecimalFormat f = new DecimalFormat("0.00");
    return "Nº " + this.getNumber() + " - " + this.getTime() + "s de conversación" + " - " + "tarificados "
        + f.format(this.pago) + " euros";
  }
}
