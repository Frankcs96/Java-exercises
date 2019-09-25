import java.util.Scanner;

public class Exercise01 {
	
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a day of the week to get your first subject of the day");
    String day = sc.nextLine().toLowerCase();
    
    
    if(day.equals("monday")) {
      
        System.out.println("First subject: PRO");
    }
    
    else if(day.equals("tuesday")) {
      
        System.out.println("First subject: EDD");
    }
    
    else if(day.equals("wednesday")) {
      
        System.out.println("First subject: PRO");
    }
    
    else if(day.equals("thursday")) {
      
        System.out.println("First subject: PRO");
    }
    
    else if(day.equals("friday")) {
      
        System.out.println("First subject: SINF");
    }
    
    else {
      
        System.out.println("Error, you have to enter a day of the week between Monday and Friday");
      
    }
    
	}
}

