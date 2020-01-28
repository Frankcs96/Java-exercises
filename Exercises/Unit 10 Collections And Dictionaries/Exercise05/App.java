
import java.util.ArrayList;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Disc> discs = new ArrayList<Disc>();
    boolean running = true;

    while (running) {

      System.out.println("\n\nDISC COLLECTION");
      System.out.println("=====================");
      System.out.println("1. Show List");
      System.out.println("2. New Disc");
      System.out.println("3. Update");
      System.out.println("4. Delete");
      System.out.println("5. Exit");
      System.out.print("Enter an option: ");
      int option = sc.nextInt();
      sc.nextLine();

      switch (option) {

        case 1:
          System.out.println("1. Full list");
          System.out.println("2. List by author");
          System.out.println("3. List by genre");
          System.out.println("4. list by duration");
          System.out.print("Enter an option: ");
          int option2 = sc.nextInt();
          sc.nextLine();
          switch (option2) {
            case 1:
              for (Disc disc : discs) {
                System.out.println(disc);
              }
              break;

            case 2:
              System.out.print("Enter an author: ");
              String author = sc.nextLine();
              for (Disc disc : discs) {
                if (disc.getAuthor().equalsIgnoreCase(author)) {
                  System.out.println(disc);
                }
              }
              break;

            case 3:
              System.out.print("Enter a genre: ");
              String genre = sc.nextLine();
              for (Disc disc : discs) {
                if (disc.getGenre().equalsIgnoreCase(genre)) {
                  System.out.println(disc);
                }
              }
              break;

            case 4:
              System.out.print("Enter first minute of the duration range: ");
              int firstNumber = sc.nextInt();
              System.out.print("Enter second minute of the duration range: ");
              int secondNumber = sc.nextInt();
              for (Disc disc : discs) {
                if ((disc.getDuration() >= firstNumber)
                    && (disc.getDuration() <= secondNumber)) {
                  System.out.println(disc);
                }
              }
              break;
          }

          break;

        case 2:

          boolean isCodeRepeated = false;
          System.out.print("Enter disc code: ");
          String code = sc.nextLine();
          for (Disc disc : discs) {

            if (disc.getCode().equalsIgnoreCase(code)) {
              isCodeRepeated = true;
            }

          }
          if (isCodeRepeated) {
            System.out.println("You already have a disc with that code!");
          } else {
            System.out.print("Enter the author: ");
            String author = sc.nextLine();
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the genre: ");
            String genre = sc.nextLine();
            System.out.print("Enter the duration (minutes): ");
            int duration = sc.nextInt();
            discs.add(new Disc(code, author, title, genre, duration));
          }
          break;

        case 3:
          System.out.print("Enter the disc's code that you want to update: ");
          String codeForUpdate = sc.nextLine();
          boolean isInside = false;
          for (Disc disc : discs) {

            if (disc.getCode().equalsIgnoreCase(codeForUpdate)) {

              isInside = true;
            }

          }
          if (isInside) {
            int i = 0;
            while (!discs.get(i).getCode().equalsIgnoreCase(codeForUpdate)) {
              i++;
            }
            System.out.print("Enter a new author or press enter to continue: ");
            String author = sc.nextLine();
            if (!author.equalsIgnoreCase("")) {
              discs.get(i).setAuthor(author);
            }
            System.out.print("Enter a new title or press enter to continue: ");
            String title = sc.nextLine();
            if (!title.equalsIgnoreCase("")) {
              discs.get(i).setTitle(title);
            }

            System.out.print("Enter a new genre or press enter to continue: ");
            String genre = sc.nextLine();
            if (!genre.equalsIgnoreCase("")) {
              discs.get(i).setGenre(genre);
            }

            System.out.print("Enter a new duration or press enter to continue: ");
            String duration = sc.nextLine();
            if (!duration.equalsIgnoreCase("")) {
              discs.get(i).setDuration(Integer.parseInt(duration));
            }

          } else {
            System.out.println("Disc code do not exist!");
          }

          break;

        case 4:
          System.out.print("Enter the disc's code that you want to delete: ");
          String codeForDelete = sc.nextLine();
          boolean isInsideForDelete = false;
          for (Disc disc : discs) {

            if (disc.getCode().equalsIgnoreCase(codeForDelete)) {
              isInsideForDelete = true;
            }

          }
          if (isInsideForDelete) {
            int i = 0;
            while (!discs.get(i).getCode().equalsIgnoreCase(codeForDelete)) {
              i++;
            }
            System.out.print("Removing disc wait");
            try {
              Thread.sleep(1000);
              System.out.print(".");
              Thread.sleep(1000);
              System.out.print(".");
              Thread.sleep(1000);
              System.out.println(".");
              discs.remove(i);
              System.out.println("Disc removed from the collection");
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          } else {
            System.out.println("Disc code do not exist!");
          }
          break;

        case 5:
          System.out.println("See you soon!!!");
          running = false;
          break;

        default:
          System.out.println("Wrong option!");
      }


    }


  }
}
