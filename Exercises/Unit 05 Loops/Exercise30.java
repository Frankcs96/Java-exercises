import java.util.Scanner;

public class Exercise30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int firstDay = 0;
    int secondDay = 0;
    String dayName = "";
    String dayName2 = "";
    boolean isValid = true;
    int hour1 = 0;
    int hour2 = 0;
    do {
      
      System.out.println("Enter the first hour: ");
      System.out.println("-----------------------");
      System.out.println("Day: (1-7) (Monday,Tuesday...)");
      String day1 = sc.nextLine().toLowerCase();
      System.out.println("Hour: (0-23)");
      hour1 = sc.nextInt();
      sc.nextLine();
    
      switch(day1) {
        case "monday":
        case "1":
          firstDay = 1;
          dayName = "Monday";
          break;
        case "tuesday":
        case "2":
          firstDay = 2;
          dayName = "Tuesday";
          break;
        case "wednesday":
        case "3":
          firstDay = 3;
          dayName = "Wednesday";
          break;
        case "thursday":
        case "4":
          firstDay = 4;
          dayName = "Thursday";
          break;
        case "friday":
        case "5":
          firstDay = 5;
          dayName = "Friday";
          break;
        case "saturday":
        case "6":
          firstDay = 6;
          dayName = "Saturday";
          break;
        case "sunday":
        case "7":
          firstDay = 7;
          dayName = "Sunday";
          break;
        default:
           firstDay = 0;
      }
      
    
      System.out.println("Enter the second hour: ");
      System.out.println("-----------------------");
      System.out.println("Day: (1-7)");
      String day2 = sc.nextLine().toLowerCase();
      System.out.println("Hour: (0-23)");
      hour2 = sc.nextInt();
      sc.nextLine();
    
      switch(day2) {
        case "monday":
        case "1":
          secondDay = 1;
          dayName2 = "Monday";
          break;
        case "tuesday":
        case "2":
          secondDay = 2;
          dayName2 = "Tuesday";
          break;
        case "wednesday":
        case "3":
          secondDay = 3;
          dayName2 = "Wednesday";
          break;
        case "thursday":
        case "4":
          secondDay = 4;
          dayName2 = "Thursday";
          break;
        case "friday":
        case "5":
          secondDay = 5;
          dayName2 = "Friday";
          break;
        case "saturday":
        case "6":
          secondDay = 6;
          dayName2 = "Saturday";
          break;
        case "sunday":
        case "7":
          secondDay = 7;
          dayName2 = "Sunday";
          break;
        default:
           secondDay = 0;
      }
      
      isValid = true;
      
      if (secondDay == 0 || firstDay == 0) {
        System.out.println("Wrong day of the week... (1-7) (Monday,Tuesday...)");
        isValid = false;
      }
      
      if (secondDay <= firstDay) {
        System.out.println("Second day must be later");
        isValid = false;
      }
      
      if ((hour1 < 0) || (hour1 > 23) || (hour2 < 0) || (hour2 > 23)) {
        
        System.out.println("Wrong hour... only allowed from 0 to 23");
        isValid = false;
      }
  
      
    } while (!isValid);
    
    System.out.print("From " + firstDay + ":00h " + dayName);
    System.out.print(" to " + secondDay + ":00h " + dayName2);
    System.out.print(" There are " + (((secondDay * 24) + hour2) - ((firstDay * 24) + hour1)));
    System.out.print(" hours left");
    
    
    
    
    
  
    
  }
}
