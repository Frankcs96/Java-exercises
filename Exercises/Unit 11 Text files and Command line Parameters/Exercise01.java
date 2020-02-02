import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise01 {

  public static void main(String[] args) {

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      int number = 1;
      while (number <= 500) {
        if (isPrime(number)) {
          bw.write(number + "\n");
        }
        number++;
      }

      bw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }


  public static boolean isPrime(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
