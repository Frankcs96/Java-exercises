
public class Exercise21 {
  public static void main(String[] args) {
    String coin = "";
    String side;
    int random1;
    int random2;
    
    for (int i = 1; i <= 5; i++) {
      random1 = (int)(Math.random() * ((8 - 1) + 1)) + 1;
      random2 = (int)(Math.random() * ((2 - 1) + 1)) + 1;
      
      switch (random1) {
        case 1:
          coin = "1 centimo";
          break;
        case 2:
          coin = "2 centimos";
          break;
        case 3:
          coin = "5 centimos";
          break;
        case 4:
          coin = "10 centimos";
          break;
        case 5:
          coin = "20 centimos";
          break;
        case 6:
          coin = "50 centimos";
          break;
        case 7:
          coin = "1 euro";
          break;
        case 8:
          coin = "2 euros";
          break;

        default:
        
      }
      
      if (random2 == 1) {
        side = "cara";
      } else {
        side = "cruz";
      }
      
      
      System.out.println(coin + "- " + side);
    }
  }
}
