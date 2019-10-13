
public class Exercise04 {
  public static void main(String[] args) {
    System.out.println("Printing 20 random numbers between 0 and 10: ");
    
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random() * 11) + " ");
    }
  }
}
