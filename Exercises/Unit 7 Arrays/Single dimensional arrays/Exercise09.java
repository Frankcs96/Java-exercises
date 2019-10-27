import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[8];

    System.out.println("Enter 8 numbers pressing [ENTER]: ");
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    
    for (int n : numbers) {
      if (n % 2 == 0) {
        System.out.println(n + " Even");
      } else {
        System.out.println(n+ " Odd");
      }
      
    }


  }
}
