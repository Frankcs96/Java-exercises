import java.util.Scanner;

public class Exercise24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1 - Junior programmer");
    System.out.println("2 - Senior programmer");
    System.out.println("3 - Project manager");
    System.out.println("Enter the position of the employee (1-3)");
    int position = sc.nextInt();
    double baseSalary = 0;
    
    if (position == 1) {
      baseSalary = 950;
    }
    
    if (position == 2) {
      baseSalary = 1200;
    }
    
    if (position == 3) {
      baseSalary = 1600;
    }
    
    System.out.println("How many days have you been traveling visiting customers?");
    int daysTraveling = sc.nextInt();
    double dietSalary = daysTraveling * 30;
    double grossSalary = dietSalary + baseSalary;
    
    System.out.println("Enter your marital status (1- single 2 - married) ");
    int maritalStatus = sc.nextInt();
    double pitPercentage = 0;
    if (maritalStatus == 1) {
      pitPercentage = 25;
    }
    
    if (maritalStatus == 2) {
      pitPercentage = 20;
    }
    
    double pit = pitPercentage * grossSalary / 100;
    
    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("┃ Base salary            %8.2f ┃\n", baseSalary);
    System.out.printf("┃ Diets (%1d Travels)      %8.2f ┃\n", daysTraveling, dietSalary);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Gross salary           %8.2f ┃\n", grossSalary);
    System.out.printf("┃ PIT withholding (%.0f%%)  %8.2f ┃\n", pitPercentage, pit);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ net salary             %8.2f ┃\n", grossSalary - pit);
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    
  }
}
