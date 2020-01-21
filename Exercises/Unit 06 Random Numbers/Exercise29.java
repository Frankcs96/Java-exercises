import java.util.Scanner;

public class Exercise29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int minTemp = 0;
    int maxTemp = 0;
    int prob = (int)(Math.random() * ((10 - 1) + 1)) + 1;
    String sunnyOrCloudy = "";
    
    System.out.println("1. Spring\n2. Summer\n3. Autumn\n4. Winter");
    System.out.print("Choose season (1-4): ");
    int season = sc.nextInt();
    System.out.println();
    
    switch (season) {
      case 1:
        minTemp = (int)(Math.random() * ((30 - 15) + 1)) + 15;
        maxTemp = (int)(Math.random() * ((30 - minTemp) + 1)) + minTemp;
        if (prob <= 6) {
          sunnyOrCloudy = "Sunny";
        } else {
          sunnyOrCloudy = "Cloudy";
        }
        break;
        
      case 2:
        minTemp = (int)(Math.random() * ((45 - 25) + 1)) + 25;
        maxTemp = (int)(Math.random() * ((45 - minTemp) + 1)) + minTemp;
        if (prob <= 8) {
          sunnyOrCloudy = "Sunny";
        } else {
          sunnyOrCloudy = "Cloudy";
        }
        break;
      case 3:
        minTemp = (int)(Math.random() * ((30 - 20) + 1)) + 20;
        maxTemp = (int)(Math.random() * ((30 - minTemp) + 1)) + minTemp;
        if (prob <= 4) {
          sunnyOrCloudy = "Sunny";
        } else {
          sunnyOrCloudy = "Cloudy";
        }
        break;
      case 4:
        minTemp = (int)(Math.random() * ((25 - 0) + 1)) + 0;
        maxTemp = (int)(Math.random() * ((25 - minTemp) + 1)) + minTemp;
        if (prob <= 2) {
          sunnyOrCloudy = "Sunny";
        } else {
          sunnyOrCloudy = "Cloudy";
        }
        break;
        

      default:
        System.out.println("Wrong season");
        break;
    }
    
    System.out.println("Weather forecast for tomorrow\n---------------------------");
    System.out.println("Minimum temperature: " + minTemp);
    System.out.println("Maximum temperature: " + maxTemp);
    
    System.out.println(sunnyOrCloudy);
  }
 
  
  
}
