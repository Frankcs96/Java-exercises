package figures;

public class Main {
  //Draw a line with the character that you want N times.
  public static String drawLine(char charac, int size) {
    String line = "";
    for (int i = 0; i < size; i++) {
      line += charac;
    }

    return line;

  }
}
