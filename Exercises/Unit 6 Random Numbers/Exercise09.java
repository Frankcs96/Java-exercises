
public class Exercise09 {
  public static void main(String[] args) {
    boolean running = true;
    int random;
    int counter = 0;
    
    while (running) {
      
      random = (int)(Math.random() * ((100 - 0) + 1)) + 0;
      
      if (random % 2 == 0) {
        System.out.print(random + " ");
        counter++;
      }
      
      if (random == 24) {
        running = false;
      }
      
      
    }
    
    System.out.println("\nTotal: " + counter + " numbers generated");
  }
}
