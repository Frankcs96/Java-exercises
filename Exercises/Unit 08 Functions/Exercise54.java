
public class Exercise54 {
  public static void main(String[] args) {
    int a[] = {714,81,9,11};
    int b[] = {6,66,666};
    int c[] = {};
    System.out.println("Ocurrency (8,4672) returns " + ocurrency(8, 4672));
    System.out.println("Ocurrency (5,25153) returns " + ocurrency(5, 25153));
    System.out.println("Ocurrency (2,123456) returns " + ocurrency(2, 123456));
    System.out.println("Ocurrency (1,a) returns " + ocurrency(1, a)); 
    System.out.println("Ocurrency (6,b) returns " + ocurrency(6, b));
    System.out.println("Ocurrency (6,c) returns " + ocurrency(6, c));
  }


  public static int ocurrency(int digit, int n) {
    int counter = 0;
    for (int i = 0; i < maths.Main.getDigits(n); i++) {
      if (maths.Main.digitN(n, i) == digit) {
        counter++;
      }
    }
    return counter;
  }

  public static int ocurrency(int digit, int[] n) {
    int counter = 0;
    for (int j = 0; j < n.length; j++) {
      for (int i = 0; i < maths.Main.getDigits(n[j]); i++) {
        if (maths.Main.digitN(n[j], i) == digit) {
          counter++;
        }
      }
      
    }

    return counter;
  }
}
