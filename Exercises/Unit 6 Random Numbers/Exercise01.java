
public class Exercise01 {
  public static void main(String[] args) {
    int dice = 0;
    int sum = 0;
    
    for (int i = 1; i <= 3; i++) {
      dice = (int)(Math.random() * 6) + 1;
      sum += dice;
      
      System.out.println("Dice " + i + ": " + dice);
      
    }
    System.out.println("Total: " + sum);
  }
}
