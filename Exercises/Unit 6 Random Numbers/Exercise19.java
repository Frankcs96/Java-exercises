
public class Exercise19 {
  public static void main(String[] args) {
    int number;
    int evenMax = -100;
    int oddMin = 200;
    int sum = 0;
    
    System.out.println("50 random numbers between -100 and 200:");
    
    for (int i = 1; i <= 50; i++) {
      number = (int)(Math.random() * ((200 - (-100)) + 1)) + (-100);
      
      System.out.print(number + " ");
      
      if (number % 2 == 0) {
        
        if (number > evenMax) {
          evenMax = number;
        }
        
        sum += number;
        
      } else {
        if (number < oddMin) {
          oddMin = number;
        }
        sum += number;
      }
    }
    
    System.out.println("\nMaximum even number: " + evenMax);
    System.out.println("Minimum odd number: " + oddMin);
    System.out.println("Average: " + sum / 50);
  }
}
