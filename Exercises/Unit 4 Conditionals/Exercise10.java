import java.util.Scanner;

public class Exercise10 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Discover your zodiac sign");
    
    System.out.println("Please enter your month of birth (January-December) ");
    String month = sc.nextLine();
    month = month.toLowerCase(); // we transform the input to lower case so the user can type
                                 // the month without being case sensitive.
    
    System.out.println("Please enter your day of birth ");
    int day = sc.nextInt();
    
    switch(month) {
      
      case "january":
        
        if (day >= 21) {
          System.out.println("You are Aquarius");
        } else {
          System.out.println("You are Capricorn");
        }
        break;
      
        
      case "february":
        if (day >= 20) {
          System.out.println("You are Pisces");
        } else {
          System.out.println("You are Aquarius");
        }
        break;
        
      case "march":
        if (day >= 21) {
          System.out.println("You are Aries");
        } else {
          System.out.println("You are Pisces");
        }
        break;
        
      case "april":
        if (day >= 21) {
          System.out.println("You are Taurus");
        } else {
          System.out.println("You are Aries");
        }
        break;
        
      case "may":
        if (day >= 22) {
          System.out.println("You are Gemini");
        } else {
          System.out.println("You are Taurus");
        }
        break;
      
      case "june":
        if (day >= 22) {
          System.out.println("You are Cancer");
        } else {
          System.out.println("You are Gemini");
        }
        break;
        
      case "july":
        if (day >= 24) {
          System.out.println("You are Leo");
        } else {
          System.out.println("You are Cancer");
        }
        break;
        
      case "august":
        if (day >= 24) {
          System.out.println("You are Virgo");
        } else {
          System.out.println("You are Leo");
        }
        break;
        
      case "september":
        if (day >= 24) {
          System.out.println("You are Libra");
        } else {
          System.out.println("You are Virgo");
        }
        break;
        
      case "october":
        if (day >= 24) {
          System.out.println("You are Scorpio");
        } else {
          System.out.println("You are Libra");
        }
        break;
        
      case "november":
        if (day >= 23) {
          System.out.println("You are Sagittarius");
        } else {
          System.out.println("You are Scorpio");
        }
        break;
      
      case "december":
        if (day >= 22) {
          System.out.println("You are Capricorn");
        } else {
          System.out.println("You are Sagottarius");
        }
        break;  
        
      default:
        System.out.println("Wrong month");
        
    
    
    
    }
  }
}  




