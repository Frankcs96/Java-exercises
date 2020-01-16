public class Ameba {
  private int peso;

  public Ameba() {
    this.peso = 3;
  }

  public void come (int particula) {
    this.peso += particula - 1;

  }

  public void come (Ameba ameba) {
    this.peso += ameba.peso - 1;
    ameba.peso = 0;
  }


  @Override
  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos.";
  }
}
