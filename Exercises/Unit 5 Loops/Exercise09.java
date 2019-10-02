import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("****Digits counter****");
    System.out.println("Enter a number");
    
    int number = sc.nextInt();
    int digitCounter = 0;
    
    for (int i = 1; i < number; i *= 10) {
      digitCounter++;
    }
    
    // solution without loops int digitCounter = (int)(Math.log10(number)+1);
    
    System.out.println(number + " has " + digitCounter + " digits");
    
    
  }
}
