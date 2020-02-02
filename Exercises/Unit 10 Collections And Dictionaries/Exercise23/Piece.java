public class Piece {
  private String name;
  private int value;
  private int units;

  public Piece (String name, int value, int units) {
    this.name = name;
    this.value = value;
    this.units = units;
  }

  public void capture () {
    this.units--;
  }

  public boolean isDead() {
    return this.units == 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }
}
