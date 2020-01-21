import java.util.ArrayList;

public class Exercise01 {

  public static void main(String[] args) {
    ArrayList <String> names = new ArrayList<String>();
    names.add("Francisco");
    names.add("Miguel");
    names.add("Luca");
    names.add("Pedro");
    names.add("Ivan");
    names.add("Javi");

    for (String name : names) {
      System.out.println(name);
    }
  }
}
