
public class Exercise37 {
  public static void main(String[] args) {
    System.out.println("Number 213 in morse code: ");
    System.out.println(transformToMorse(213));
    System.out.println("Number 10652 in morse code: ");
    System.out.println(transformToMorse(10652));
    System.out.println("Number 4 in morse code: ");
    System.out.println(transformToMorse(4));
  }

  public static String transformToMorse(int n) {
    String result = "";

    for (int i = 0; i < maths.Main.getDigits(n); i++) {
      switch (maths.Main.digitN(n, i)) {
        case 0:
          result += "_ _ _ _ _ ";
          break;

        case 1:
          result += ". _ _ _ _ ";
          break;

        case 2:
          result += ". . _ _ _ ";
          break;

        case 3:
          result += ". . . _ _ ";
          break;

        case 4:
          result += ". . . . _ ";
          break;

        case 5:
          result += ". . . . . ";
          break;

        case 6:
          result += "_ . . . . ";
          break;

        case 7:
          result += "_ _ . . . ";
          break;

        case 8:
          result += "_ _ _ . . ";
          break;

        case 9:
          result += "_ _ _ _ . ";
          break;
        default:
          
      }
    }

    return result;
  }
}
