import com.sun.javafx.binding.StringFormatter;
import java.text.DecimalFormat;

public class TarjetaRegalo {
  private double saldo;
  private String numero;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.numero = "";
    for (int i = 0; i < 5 ; i++) {
      this.numero += (int)(Math.random() * ((9 - 0) + 1)) + 0;

    }
  }

  public void gasta (double precio) {
    DecimalFormat f = new DecimalFormat("0.00");
    if (saldo < precio) {
      System.out.println("No tiene suficiente saldo para gastar " + f.format(precio) + "€");
    } else {
      this.saldo -= precio;
    }
  }

  public TarjetaRegalo fusionaCon (TarjetaRegalo tarjeta) {
    double saldoTotal = this.saldo + tarjeta.saldo;
    this.saldo = 0;
    tarjeta.saldo = 0;

    return new TarjetaRegalo(saldoTotal);
  }

  @Override
  public String toString() {
    DecimalFormat f = new DecimalFormat("0.00");
    return "Tarjeta nº " + this.numero + " - Saldo " + f.format(this.saldo) + "€";
  }
}
