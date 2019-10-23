import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    

    char[] symbol = new char[10];
    symbol[0] = 'a';
    symbol[1] = 'x';
    symbol[4] = '@';
    symbol[6] = ' ';
    symbol[7] = '+';
    symbol[8] = 'Q';
    
    for (char s : symbol) {
      System.out.print(s + ", ");
    }
    
    // no initialized positions are equal to an empty char

  }
}
