import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bike bmx = new Bike();
    Car volvo = new Car();

    boolean running = true;
    while (running) {
      System.out.println("VEHICLES");
      System.out.println("========");
      System.out.println("1.Travel with bike");
      System.out.println("2.Do wheelies with bike");
      System.out.println("3.Travel with car");
      System.out.println("4.Burn wheel with car");
      System.out.println("5.Show Bike Km");
      System.out.println("6.Show Car Km");
      System.out.println("7.Show total Km");
      System.out.println("8.Exit");

      int option = sc.nextInt();

      switch (option) {
        case 1:
          System.out.println("How many km do you want to travel?");
          int km = sc.nextInt();
          bmx.travel(km);
          System.out.println("Travelling " + km + " km");
          break;

        case 2:
          bmx.doWheelies();
          break;

        case 3:
          System.out.println("How many km do you want to travel?");
          km = sc.nextInt();
          volvo.travel(km);
          System.out.println("Travelling " + km + " km");

          break;

        case 4:
          volvo.burnWheel();

          break;

        case 5:
          System.out.println("Bike km: " + bmx.showKm());

          break;

        case 6:
          System.out.println("Car km: " + volvo.showKm());

          break;

        case 7:
          System.out.println("Total km: " + Vehicle.showTotalKm());

          break;

        case 8:
          System.out.println("Thank you");
          running = false;

          break;

        default:
          System.out.println("Wrong Option");
          break;
      }
    }
    
    

  }
}
