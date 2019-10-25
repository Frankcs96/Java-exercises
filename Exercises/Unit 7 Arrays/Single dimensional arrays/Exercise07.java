import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] numbers = new String[100];
    int random;
    
    for (int i = 0; i < numbers.length; i++) {
      random = (int)(Math.random() * ((20 - 0) + 1)) + 0; 
      numbers[i] = ""+random;
    }
    
    for (String n : numbers) {
      System.out.print(n + " ");
    }
    
    System.out.print("\nWhat number do you want to change: ");
    String numberChange = sc.nextLine();
    System.out.print("With a value of: ");
    String newValue = sc.nextLine();
    
   
    
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i].equals(numberChange)) {
        numbers[i] = "\""+ newValue + "\"";
      }
    }
    
    for (String n : numbers) {
      System.out.print(n + " ");
    }
  }
}
