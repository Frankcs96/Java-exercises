
public class Exercise55 {
  public static void main(String[] args) {
    String array[] = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    String noRepeated[] = noRepeat(array);

    for (String s : noRepeated) {
      System.out.print(s + " ");
    }
  }

  public static String[] noRepeat(String[] s) {
    int repetitions = 0;
    String[] noRepeatTemp = new String[s.length];
    boolean isInside = false;
    for (int i = 0; i < s.length; i++) {
      isInside = false;
      for (int j = 0; j < noRepeatTemp.length; j++) {
        if (s[i] == noRepeatTemp[j]) {
          isInside = true;

        }
      }
      if (!isInside) {
        noRepeatTemp[i] = s[i];
        repetitions++;
      } else {
        noRepeatTemp[i] = "";
      }
    }
    String[] noRepeat = new String[repetitions];
    repetitions = 0;
    for (int i = 0; i < noRepeatTemp.length; i++) {
      if (!noRepeatTemp[i].isEmpty()) {
        noRepeat[repetitions++] = noRepeatTemp[i];
      }

    }
    return noRepeat;
  }
}
