
public class Exercise05 {
  public static void main(String[] args) {
    System.out.println("Printing 50 random numbers between 100 and 199: ");
    int randomNumber = 0;
    int sum = 0;
    int maximum = 0;
    int minimum = 199;
    
    for (int i = 0; i < 50; i++) {
      randomNumber = (int)(Math.random() * ((199 - 100) + 1)) + 100;
      sum += randomNumber;
      
      if (randomNumber < minimum) {
        minimum = randomNumber;
      }
      
      if (randomNumber > maximum) {
        maximum = randomNumber;
      }
      
      System.out.print(randomNumber + " ");
      
    }
    
    System.out.println("\nMaximum: " + maximum);
    System.out.println("Minimum: " + minimum);
    System.out.println("Average: " + sum / 50);
  }
}
