
public class Exercise18 {
  public static void main(String[] args) {
    
    int randomNumber1 = 0;
    int randomNumber2 = 0;
    int randomNumber3 = 0;
    int temp = 0;
    
    
    String colour = "";
    
    for (int i = 1; i <= 3; i++) {
            
       
      if (i == 1) {
        randomNumber1 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
      }
      
      if (i == 2) {
        randomNumber2 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        
        while (randomNumber1 == randomNumber2) {
          randomNumber2 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        }
        
        temp = randomNumber1;
        randomNumber1 = randomNumber2;
        randomNumber2 = temp;
      }

      if (i == 3) {
        randomNumber3 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        
        while (randomNumber3 == randomNumber2 || randomNumber3 == randomNumber1) {
          randomNumber3 = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        }
        
        randomNumber1 = randomNumber3;
      }
      
      
      switch (randomNumber1) {
        case 1:
          colour = "Red";
          break;
          
        case 2:
          colour = "Blue";
          break;
          
        case 3:
          colour = "Green";
          break;
          
        case 4:
          colour = "Yellow";
          break;
          
        case 5:
          colour = "Violet";
          break;
          
        case 6:
          colour = "Orange";
          break;

        default:
          
      }
      
      System.out.print(colour +", ");
      
    }
    
    
  }
}
