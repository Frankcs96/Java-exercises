
public class Exercise16 {
  public static void main(String[] args) {
    System.out.println("$$$$ Slot Machine $$$$");
    
    int randomNumber;
    String slot = "";
    int slot1 = 0;
    int slot2 = 0;
    int slot3 = 0;
    
    
    for (int i = 1; i <= 3; i++) {
      
      randomNumber = (int)(Math.random() * ((5 - 1) + 1)) + 1;
      
      switch (randomNumber) {
        case 1:
          slot = "Heart";
          break;
        case 2:
          slot = "Diamond";
          break;
        case 3:
          slot = "Horseshoe";
          break;
        case 4:
          slot = "Bell";
          break;
        case 5:
          slot = "Lemon";
          break;

        default:
        
      }
      
      if (i == 1) {
        slot1 = randomNumber;
      }
      
      if (i == 2) {
        slot2 = randomNumber;
      }
      

      if (i == 3) {
        slot3 = randomNumber;
      }
      
      System.out.print(slot + " ");
      
    }
    
    if ((slot1 == slot2) && (slot1 == slot3)) {
      System.out.println("\nCongratulations, you have won 10 coins.");
    } else if ((slot1 == slot2 || slot2 == slot3 || slot1 == slot3)){
      System.out.println("\nGood, you have recovered your coin.");
    } else {
      System.out.println("\nSorry, you have lost");
    }
    
    
    
    
  }
}
