import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    System.out.println("Enter 10 words Pressing enter: ");

    for (int i = 0; i < 10 ; i++) {
      words.add(sc.nextLine());
    }

    System.out.println("Array list sorted: ");
    Collections.sort(words);
    for (String word : words) {
      System.out.println(word);
    }

  }
}
