import java.text.DecimalFormat;
import java.util.ArrayList;


public class CuentaCorriente {

  private String numeroCuenta;
  private int saldo;
  private ArrayList<String> movimientos;


  public CuentaCorriente(int saldo) {
    this.saldo = saldo;
    String numeroCuentaTemp = "";
    for (int i = 0; i <= 9; i++) {
      numeroCuentaTemp += (int) (Math.random() * ((9 - 0) + 1)) + 0;
    }
    this.numeroCuenta = numeroCuentaTemp;
    this.movimientos = new ArrayList<>();


  }

  public CuentaCorriente() {
    this(0);
  }

  public void ingreso(int n) {
    DecimalFormat f = new DecimalFormat("0.00");
    this.saldo += n;
    this.movimientos.add("Ingreso de " + n + " € Saldo: " + f.format(this.saldo) + " €");

  }

  public void cargo(int n) {
    DecimalFormat f = new DecimalFormat("0.00");
    this.saldo -= n;
    this.movimientos.add("Cargo de " + n + " € Saldo: " + f.format(this.saldo) + " €");

  }

  public void transferencia(CuentaCorriente cuenta, int n) {
    DecimalFormat f = new DecimalFormat("0.00");
    this.saldo -= n;
    cuenta.saldo += n;
    this.movimientos.add(
        "Transf. emitida de " + n + " € a la cuenta " + cuenta.numeroCuenta + " Saldo: "
            + f.format(this.saldo) + " €");
    cuenta.movimientos
        .add("Transf. recibida de " + n + " € de la cuenta " + this.numeroCuenta + " Saldo: "
            + f.format(cuenta.saldo) + " €");

  }

  public void movimientos() {

    for (String movimiento : movimientos) {
      System.out.println(movimiento);
    }
  }

  @Override
  public String toString() {
    DecimalFormat f = new DecimalFormat("0.00");
    return "Número de cta: " + this.numeroCuenta + " Saldo: " + f.format(this.saldo);
  }
}
