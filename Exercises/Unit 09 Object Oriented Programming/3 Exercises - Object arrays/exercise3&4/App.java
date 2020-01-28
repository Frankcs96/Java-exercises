
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Disc[] discs = new Disc[3];
    boolean running = true;

    while (running) {

      int numberOfDisc = 0;

      for (Disc disc : discs) {
        if (disc != null) {
          numberOfDisc++;
        }

      }

      System.out.println("\n\nDISC COLLECTION [" + numberOfDisc + "/" + discs.length +"]");
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
                if (disc != null) {
                  System.out.println(disc);
                }
              }
              break;

            case 2:
              System.out.print("Enter an author: ");
              String author = sc.nextLine();
              for (Disc disc : discs) {
                if (disc != null && disc.getAuthor().equalsIgnoreCase(author)) {
                  System.out.println(disc);
                }
              }
              break;

            case 3:
              System.out.print("Enter a genre: ");
              String genre = sc.nextLine();
              for (Disc disc : discs) {
                if (disc != null && disc.getGenre().equalsIgnoreCase(genre)) {
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
                if (disc != null && (disc.getDuration() >= firstNumber)
                    && (disc.getDuration() <= secondNumber)) {
                  System.out.println(disc);
                }
              }
              break;
          }
          
          break;
            
          

        case 2:
          //Check if array is full
          boolean isFull = true;
          for (Disc disc : discs) {
            if (disc == null) {
              isFull = false;
            }
          }
          if (isFull) {
            System.out.println("Sorry you are out of space...!");
          } else {
            boolean isCodeRepeated = false;
            System.out.print("Enter disc code: ");
            String code = sc.nextLine();
            for (Disc disc : discs) {
              if (disc != null) {
                if (disc.getCode().equalsIgnoreCase(code)) {
                  isCodeRepeated = true;
                }
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
              int i = 0;
              while (discs[i] != null) {
                i++;
              }
              discs[i] = new Disc(code, author, title, genre, duration);
            }

          }

          break;

        case 3:
          System.out.print("Enter the disc's code that you want to update: ");
          String code = sc.nextLine();
          boolean isInside = false;
          for (Disc disc : discs) {

            if (disc != null) {

              if (disc.getCode().equalsIgnoreCase(code)) {

                isInside = true;
              }

            }
          }
          if (isInside) {
            int i = 0;
            while (!discs[i].getCode().equalsIgnoreCase(code)) {
              i++;
            }
            System.out.print("Enter a new author or press enter to continue: ");
            String author = sc.nextLine();
            if (!author.equalsIgnoreCase("")) {
              discs[i].setAuthor(author);
            }
            System.out.print("Enter a new title or press enter to continue: ");
            String title = sc.nextLine();
            if (!title.equalsIgnoreCase("")) {
              discs[i].setTitle(title);
            }

            System.out.print("Enter a new genre or press enter to continue: ");
            String genre = sc.nextLine();
            if (!genre.equalsIgnoreCase("")) {
              discs[i].setGenre(genre);
            }

            System.out.print("Enter a new duration or press enter to continue: ");
            String duration = sc.nextLine();
            if (!duration.equalsIgnoreCase("")) {
              discs[i].setDuration(Integer.parseInt(duration));
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
            if (disc != null) {
              if (disc.getCode().equalsIgnoreCase(codeForDelete)) {
                isInsideForDelete = true;
              }
            }
          }
          if (isInsideForDelete) {
            int i = 0;
            while (!discs[i].getCode().equalsIgnoreCase(codeForDelete)) {
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
              discs[i] = null;
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
