
public class Exercise08 {
  public static void main(String[] args) {
      
    String result = "";  
    
    for (int i = 1; i <= 15; i++) {
              
      System.out.printf("%2d. |" , i);
      
      
      for (int j = 1; j <= 3; j++) {
        
        if (i == 15) {
          j = 3;
        }
        
        int random = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        switch (random) {
          case 1:             
          case 2:  
          case 3:
            result = "1  |";
            break;
          case 4:
          case 5:
            result = " X |";
            break;
          case 6:
            result = "  2|";
            break;
            
          default:
        }
        
        System.out.printf("%s" , result);
        
      }
      
      System.out.println();
      
    }
  }
}
