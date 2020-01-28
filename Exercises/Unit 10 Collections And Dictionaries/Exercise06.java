import java.util.HashMap;
import java.util.Scanner;

public class Exercise06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> user = new HashMap<String, String>();
    user.put("Francisco", "123F");
    user.put("Maria123", "0000");
    int attempts = 3;
    boolean running = true;

    do {
      System.out.print("Enter your username: ");
      String userName = sc.nextLine();
      System.out.print("Enter your password: ");
      String password = sc.nextLine();

      if (user.containsKey(userName)) {

        if (user.get(userName).equals(password)) {
          System.out.println("Welcome " + userName);
          running = false;
        } else {
          System.out.println("Wrong password");
          attempts--;
        }
      } else {
        System.out.println("Wrong username.");
        attempts--;
      }


    } while (running && attempts != 0);

    if (attempts == 0) {
      System.out.println("Sorry you are out of attempts");
    }
  }
}
