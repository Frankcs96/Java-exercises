import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    ArrayList<Coin> coins = new ArrayList<>();
    coins.add(new Coin());

    for (int i = 1; i < 6; i++) {
      Coin coinToAdd = new Coin();
      while ((!coins.get(i - 1).getValue().equals(coinToAdd.getValue()))
          && (!coins.get(i - 1).getHeadOrTails().equals(coinToAdd.getHeadOrTails()))) {
        coinToAdd = new Coin();
      }
      coins.add(coinToAdd);
    }

    for (Coin coin : coins) {
      System.out.println(coin);
    }

  }
}
