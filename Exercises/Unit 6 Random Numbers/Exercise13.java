
public class Exercise13 {
  public static void main(String[] args) {
    int dice1 = 0;
    int dice2 = 0;
    System.out.println("Dice 1:    Dice 2:");
    do {
      
      dice1 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
      dice2 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
      
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e.getStackTrace());
      }
      
      System.out.println(dice1 + "          " + dice2);
      
      
      
    } while (dice1 != dice2);
  }
}
