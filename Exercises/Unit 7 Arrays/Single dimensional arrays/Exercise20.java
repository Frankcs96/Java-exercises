import java.util.Scanner;

public class Exercise20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Total number of kings: ");
    int numberKings = sc.nextInt();
    sc.nextLine();

    String[] kings = new String[numberKings];

    System.out.println("Enter the name of the kings pressing [ENTER]: ");

    for (int i = 0; i < numberKings; i++) {
      kings[i] = sc.nextLine();
    }



    System.out.println("The kings are: ");
    int counter = 1;

    for (int i = 0; i < kings.length; i++) {
      for (int j = 0; j < i; j++) {
        if (kings[i].equalsIgnoreCase(kings[j])) {
          counter++;

        }

      }

      System.out.println(kings[i] + " " + counter + "º");
      counter = 1;

    }



  }
}
