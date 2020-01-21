import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};


    int[] temperatures = new int[12];

    for (int i = 0; i < months.length; i++) {
      System.out.print("Enter the average temperature in " + months[i] + ": ");
      temperatures[i] = sc.nextInt();
    }
    
    for (int i = 0; i < temperatures.length; i++) {
      
      System.out.printf("%9s    |" , months[i]);
      
      for (int j = 0; j < temperatures[i]; j++) {
        System.out.print("*");
      }
      
      System.out.print(" " + temperatures[i] + "℃");
      System.out.println();
    }
  }
}

