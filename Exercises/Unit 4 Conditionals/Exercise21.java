import java.util.Scanner;

public class Exercise21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Grade of your first exam: ");
    double grade1 = sc.nextDouble();
    sc.nextLine();
    System.out.println("Grade of your second exam: ");
    double grade2 = sc.nextDouble();
    sc.nextLine();
    
    double average = (grade1 + grade2) / 2;
    
    
    if (average >= 5) {
      System.out.printf("Your programming grade is: %.2f" , average);
    } else {
      System.out.println("What was the result of your remedial exam (pass/fail)");
      String choice = sc.nextLine().toLowerCase();
      
      if (choice.equals("pass")) {
         System.out.println("Your programming grade is: 5");
      } else {
        System.out.printf("Your programming grade is: %.2f" , average);
      }
    }
    
  }
}
