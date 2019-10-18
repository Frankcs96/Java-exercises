
public class Exercise22 {
  public static void main(String[] args) {
    int counter = 0;
    System.out.println("Prime numbers between 2 and 100: ");
    for (int i = 2; i <= 100; i++) {
    
      for (int j = i; j >= 1; j--) {
        
        if (i % j == 0) {
          counter++;
        }
      }
      
      if (counter == 2) {
          System.out.print(i +" ");
      
      }
    
      counter = 0;
    }
  }
}
