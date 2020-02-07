import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise04 {

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("You have to enter 1 param [FILE NAME]");
      System.exit(-1);
    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
      ArrayList<String> words = new ArrayList<>();

      String line = "";

      while (line != null) {
        line = br.readLine();
        words.add(line);
      }
      br.close();
      words.remove(words.size() - 1);
      Collections.sort(words);

      for (String word : words) {
        bw.write(word + "\n");
      }


      bw.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();


    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
