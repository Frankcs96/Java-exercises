import java.util.Scanner;

public class Exercise35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    System.out.print("Your number in sticks system is: ");
    System.out.print(transformToSticks(number));
    
    
  }
  
  public static String transformToSticks(int n) {
    String result = "";
    for (int i = 0; i < maths.Main.getDigits(n); i++) {
      int digit = maths.Main.digitN(n, i);
      for (int j = 0; j < digit; j++) {
        result += "|";
      }
      if (i != maths.Main.getDigits(n) - 1) {
        result += "-";
      }
      
      
    }
    
    
    return result;
  }
}
