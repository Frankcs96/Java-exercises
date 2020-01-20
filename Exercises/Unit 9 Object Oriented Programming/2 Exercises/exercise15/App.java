
public class App {

  public static void main(String[] args) {
    FichaDomino[] fichas = new FichaDomino[8];
    fichas[0] = new FichaDomino((int) (Math.random() * ((6 - 0) + 1)) + 0,
        (int) (Math.random() * ((6 - 0) + 1)) + 0);

    for (int i = 1; i < fichas.length; i++) {
      fichas[i] = new FichaDomino(fichas[i - 1].getLado2(),
          (int) (Math.random() * ((6 - 0) + 1)) + 0);
    }

    for (FichaDomino f: fichas) {
      System.out.print(f);
    }


  }
}
