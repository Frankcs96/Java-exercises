
public abstract class Vehicle {
  
  private static int vehiclesCreated = 0;
  private static int totalKm = 0;
  
  private int kmTravelled;
  
  public Vehicle () {
    vehiclesCreated++;
    kmTravelled = 0;
  }
  
  public void travel (int km) {
    this.kmTravelled += km;
    Vehicle.totalKm += km;
  }
  
  public int showKm () {
    return this.kmTravelled;
  }
  
  public static int showTotalKm () {
    return Vehicle.totalKm;
  }
  
  
  
}
