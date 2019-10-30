import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] words = new String[8];
    String[] colors =
        {"green", "red", "blue", "yellow", "orange", "pink", "black", "white", "purple"};

    System.out.println("Enter 8 words pressing [ENTER]: ");

    for (int i = 0; i < words.length; i++) {
      words[i] = sc.nextLine();
    }



    System.out.println("\n\nOriginal Array:");
    System.out
        .println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out
        .println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : words) {
      System.out.printf("│%-8s", p);
    }
    System.out
        .println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");



    String[] result = new String[8];
    int counter = 0;
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < colors.length; j++) {
        if (words[i].equalsIgnoreCase(colors[j])) {
          result[counter] = colors[j];
          counter++;
        }
      }
    }
    
    for (int i = 0; i < words.length; i++) {
      boolean isColor = false;
      for (int j = 0; j < colors.length; j++) {
        if (words[i].equalsIgnoreCase(colors[j])) {
          isColor = true;
        }

      }
      if (!isColor) {
        result[counter] = words[i];
        counter++;
      }
      
    }


    System.out.println("\nFinal Array:");
    System.out
        .println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out
        .println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : result) {
      System.out.printf("│%-8s", p);
    }
    System.out
        .println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");


  }
}
