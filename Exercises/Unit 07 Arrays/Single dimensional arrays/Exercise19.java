import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[12];
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random() * ((200 - 0) + 1)) + 0; 
    }
    
    System.out.println("Original array:");
    
    System.out.println(
        "\n┌─────────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
    System.out.print("|Index    ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("│ %4d ", i);
    }
    System.out.println(
        "│\n├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
    System.out.print("|Value    ");
    for (int t : numbers) {
      System.out.printf("│  %3d ", t);
    }
    System.out.println(
        "│\n└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");
    
    System.out.println("Please, enter a number that you want to insert into the array.");
    int userNumber = sc.nextInt();
    System.out.println("Please enter the position.");
    int userPosition = sc.nextInt();
    
    for (int i = userPosition; i < numbers.length - 1; i++) {
      
      int temp = numbers[i + 1];
      numbers[i + 1] = numbers[userPosition];
      numbers[userPosition] = temp;    
      
    }
    
    numbers[userPosition] = userNumber;
    
 System.out.println("Result array:");
    
    System.out.println(
        "\n┌─────────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
    System.out.print("|Index    ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("│ %4d ", i);
    }
    System.out.println(
        "│\n├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
    System.out.print("|Value    ");
    for (int t : numbers) {
      System.out.printf("│  %3d ", t);
    }
    System.out.println(
        "│\n└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");
    

  }
}
