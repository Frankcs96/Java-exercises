import java.util.HashMap;

public class Coin {

  private String headOrTails;
  private String value;
  private static String[] values = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos",
      "25 céntimos", "50 céntimos", "1 euro", "2 euros"};


  public Coin() {
    if ((int) (Math.random() * ((2 - 1) + 1)) + 1 == 1) {
      this.headOrTails = "Head";
    } else {
      this.headOrTails = "Tails";
    }

    this.value = values[(int)(Math.random() * ((7 - 0) + 1)) + 0 ];

  }

  public String getHeadOrTails() {
    return headOrTails;
  }

  public void setHeadOrTails(String headOrTails) {
    this.headOrTails = headOrTails;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value + " - " + this.headOrTails;
  }
}
