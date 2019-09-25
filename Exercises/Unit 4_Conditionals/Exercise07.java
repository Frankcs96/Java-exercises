import java.util.Scanner;

public class Exercise07 {
	
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
    
    System.out.printf("Average: %.2f",average);
	}
}

