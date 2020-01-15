public class Terminal {
  private String number;
  private int time;

  public Terminal(String number) {
    this.number = number;
    this.time = 0;
  }

  public void llama (Terminal terminal, int time) {
    this.time += time;
    terminal.time += time;
  }

  @Override
  public String toString() {
    return "Nº " + this.number + " - " + this.time + "s de conversación";
  }
}
