
public class Exercise23 {
  public static void main(String[] args) {
    String dice = "";
    int random;
    
    for (int i = 1; i <= 5; i++) {
      random = (int)(Math.random() * ((6 - 1) + 1)) + 1;
      
      switch (random) {
        case 1:
          dice = "As";
          break;
        case 2:
          dice = "K";
          break;
        case 3:
          dice = "Q";
          break;
        case 4:
          dice = "J";
          break;
        case 5:
          dice = "7";
          break;
        case 6:
          dice = "8";
          break;
        default:
       
      }
      
      System.out.print(dice + " ");
      
    }
  }
}
