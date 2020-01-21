
public class Main {
  public static void main(String[] args) {
    Horse rocinante = new Horse("Rocinante", "White", 2, 5);
    rocinante.information();
    rocinante.jump();
    System.out.println();
    Horse felix = new Horse("Felix", "Black", 4, 0);
    felix.information();
    felix.jump();
  }
}
