import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Exercise06 {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("You have to enter 2 parameters [FILE NAME] [WORD TO LOOK FOR]");
      System.exit(-1);
    }

    try {
      int count = 0;
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String stringToLookFor = args[1];

      String line;
      while ((line = br.readLine()) != null) {
        String a[] = line.split(" ");
        for (String s : a) {
          if (s.equals(stringToLookFor) || s.equals(stringToLookFor + ".")) {
            count++;
          }
        }


      }

      
      br.close();

      System.out.println("The word " + stringToLookFor + " appears " + count + " times.");

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();


    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
