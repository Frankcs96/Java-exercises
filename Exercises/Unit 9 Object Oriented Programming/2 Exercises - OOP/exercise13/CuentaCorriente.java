import java.text.DecimalFormat;

public class CuentaCorriente {

  private String numeroCuenta;
  private int saldo;

  public CuentaCorriente(int saldo) {
    this.saldo = saldo;
    String numeroCuentaTemp = "";
    for (int i = 0; i <= 9 ; i++) {
      numeroCuentaTemp += (int)(Math.random() * ((9 - 0) + 1)) + 0;
    }
    this.numeroCuenta = numeroCuentaTemp;
  }

  public CuentaCorriente() {
    this(0);
  }

  public void ingreso (int n) {
    this.saldo += n;
  }

  public void cargo (int n) {
    this.saldo -= n;
  }

  public void transferencia (CuentaCorriente cuenta, int n) {
    this.saldo -= n;
    cuenta.saldo += n;
  }

  @Override
  public String toString() {
    DecimalFormat f = new DecimalFormat("0.00");
    return "Número de cta: " + this.numeroCuenta + " Saldo: " + f.format(this.saldo);
  }
}
