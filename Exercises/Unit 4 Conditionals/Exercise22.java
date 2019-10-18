import java.util.Scanner;

public class Exercise22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int minutesForWeekend = 0;
    System.out.println("Enter a day of the week (from Monday to Friday): ");
    String dayOfWeek = sc.nextLine();

    System.out.println("Enter an hour: ");
    int hour = sc.nextInt();
    int hourToMinutes = hour * 60;

    System.out.println("Enter the minutes: ");
    int minutes = sc.nextInt();

    if (dayOfWeek.equalsIgnoreCase("Monday")) {
      int totalMinutesForWeekend = (24 * 4 + 15) * 60;
      minutesForWeekend = totalMinutesForWeekend - hourToMinutes - minutes;
    }
    
    if (dayOfWeek.equalsIgnoreCase("Tuesday")) {
      int totalMinutesForWeekend = (24 * 3 + 15) * 60;
      minutesForWeekend = totalMinutesForWeekend - hourToMinutes - minutes;
    }
    
    if (dayOfWeek.equalsIgnoreCase("Wednesday")) {
      int totalMinutesForWeekend = (24 * 2 + 15) * 60;
      minutesForWeekend = totalMinutesForWeekend - hourToMinutes - minutes;
    }
    
    if (dayOfWeek.equalsIgnoreCase("Thursday")) {
      int totalMinutesForWeekend = (24 + 15) * 60;
      minutesForWeekend = totalMinutesForWeekend - hourToMinutes - minutes;
    }
    
    if (dayOfWeek.equalsIgnoreCase("Friday")) {
      int totalMinutesForWeekend = 15 * 60;
      minutesForWeekend = totalMinutesForWeekend - hourToMinutes - minutes;
    }

    System.out.printf("From %s %02d:%02d to weekend, there are %d minutes left", dayOfWeek, hour,
        minutes, minutesForWeekend);
  }
}
