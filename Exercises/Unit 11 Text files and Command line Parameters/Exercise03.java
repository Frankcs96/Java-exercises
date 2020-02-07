import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise03 {

  public static void main(String[] args) {

    if (args.length != 3) {
      System.out.println("You have to enter 3 params [FILE1 NAME] [FILE2 NAME] [FILE3 NAME]");
      System.exit(-1);
    }

    try {
      BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

      String line1 = "";
      String line2 = "";

      while (line1  != null || line2 != null) {
        line1 = br1.readLine();
        line2 = br2.readLine();

        if (line1 != null) {
          bw.write(line1 + "\n");
        }

        if (line2 != null) {
          bw.write(line2 + "\n");
        }
      }

      br1.close();
      br2.close();
      bw.close();


    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();


    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
