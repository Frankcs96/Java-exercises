
public class Exercise25 {
  public static void main(String[] args) {
    int randomNumber;
    boolean isPrime;
    
    System.out.println("Numbers multiple of 5: [number]");
    System.out.println("Prime numbers: #number#");
    
    for (int i = 1; i <= 100; i++) {
      randomNumber = (int)(Math.random() * ((200 - 10) + 1)) + 10;
      isPrime = true;
      
      for (int j = 2; j < randomNumber; j++) {
        if (randomNumber % j == 0) {
          isPrime = false;
        }
      }
      
      
      if (randomNumber % 5 == 0) {
        System.out.print("[" + randomNumber + "] ");
      } else if (isPrime) {
        System.out.print("#" + randomNumber + "# ");
      } else {
        System.out.print(randomNumber + " ");
      }
      
      
      
      
      
      
      
    }
  }
}
