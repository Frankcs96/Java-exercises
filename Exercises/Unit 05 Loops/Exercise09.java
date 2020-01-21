import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("****Digits counter****");
    System.out.println("Enter a number");
    
    long number = sc.nextLong();
    long copy = number;
    int digitCounter = 0;
    
    while (number > 0) {
      number /= 10;
      digitCounter++;
    }
    
    //solution without loops int digitCounter = (int)(Math.log10(number)+1);
    
    System.out.println(copy + " has " + digitCounter + " digits");

    
    
  }
}
