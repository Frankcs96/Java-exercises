import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exercise05 {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("You have to enter 2 params [FILE NAME.java] [FILE NAME.java]");
      System.exit(-1);
    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

      String lineA = "";
      String lineB = "";
      boolean blockComment = false;
      int index = 0;

      while ((lineA = br.readLine()) != null) {

        int l = lineA.length();
        lineB = lineA;


        if ((index = lineA.indexOf("/*")) != -1) {
          blockComment = true;
          lineB = lineA.substring(0, index);
          lineA = lineB;
        }


        if ((index = lineA.indexOf("*/")) != -1) {
          blockComment = false;
          lineB = lineA.substring(index + 2, l);
        }

        if (((index = lineA.indexOf("//")) != -1) && !blockComment) {
          lineB = lineA.substring(0, index);
        }

        if (!blockComment) {
          bw.write(lineB + "\n");
        }
      }




      bw.close();
      br.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();


    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
