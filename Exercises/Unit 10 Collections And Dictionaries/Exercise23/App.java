import java.util.ArrayList;
import java.util.HashMap;

public class App {

  public static void main(String[] args) {

    ArrayList<Piece> pieces = new ArrayList<>();
    pieces.add(new Piece("Dama", 9, 1));
    pieces.add(new Piece("Torre", 5, 2));
    pieces.add(new Piece("Alfil", 3, 2));
    pieces.add(new Piece("Caballo", 2, 2));
    pieces.add(new Piece("Peón", 1, 8));

    System.out.println("Fichas capturadas por el jugador: ");
    int captures = (int) (Math.random() * ((15 - 0) + 1)) + 0;
    int score = 0;

    for (int i = 0; i < captures; i++) {
      int randomIndex = (int) (Math.random() * ((4 - 0) + 1)) + 0;
      Piece randomPiece = pieces.get(randomIndex);
      if (!randomPiece.isDead()) {
        System.out.println(randomPiece.getName() + " (" + randomPiece.getValue() + " peones)");
        score += randomPiece.getValue();
        pieces.get(randomIndex).capture();

      }


    }
    System.out.println("Puntos totales: " + score + " peones");

  }
}
