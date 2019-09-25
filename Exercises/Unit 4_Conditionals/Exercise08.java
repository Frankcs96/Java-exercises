import java.util.Scanner;

public class Exercise08 {
	
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("***Calculating average of 3 grades***");
    System.out.println("Enter grade 1: ");
    double grade1 = sc.nextDouble();
    System.out.println("Enter grade 2: ");
    double grade2 = sc.nextDouble();
    System.out.println("Enter grade 3: ");
    double grade3 = sc.nextDouble();
    
    double average = (grade1 + grade2 + grade3) / 3;
    String grade = "";
    
    if(average < 5) {
      grade = "D";
      
    }
    
    if(average >= 5 && average < 6) {
      grade = "C";
    }
    
    if(average >= 6 && average < 7) {
      grade = "C+";
    }
    
    if(average >= 7 && average < 9) {
      grade = "B";
    }
    
    if(average >= 9 && average < 10) {
      grade = "A";
    }
    
    if(average == 10) {
      grade = "S";
    }
    
    System.out.printf("Average: %.2f %s",average,grade);
  }
}
