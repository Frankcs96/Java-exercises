
public class Exercise12 {
  public static void main(String[] args) {
    
    int random;
    
    for (int i = 1; i <= 200; i++) {
      
      for (int j = 1; j < 70; j++) {
        random = (int)(Math.random() * ((126 - 32) + 1)) + 32;
        
        System.out.print((char)random);
        
      }
      try {
        Thread.sleep(70);
      } catch (InterruptedException e) {
        System.out.println("ERROR");
      }
      System.out.println();
      
      
    }
    
  }
}
