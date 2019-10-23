// What happen with no initialized positions on the array?
public class Exercise01 {
  public static void main(String[] args) {
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 4;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + ", ");
    }
    
    // Positions no initialized are equal to 0.
    
  }
}
