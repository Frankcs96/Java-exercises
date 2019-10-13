
public class Exercise02 {
  public static void main(String[] args) {
    
    String suit = "";
    String card = "";
    
    int randomNumber = (int) ((Math.random() * 4) + 1);
    
    switch (randomNumber) {
      case 1:
        suit = "spades";
        break;
      case 2:
        suit = "hearts";
        break;
      case 3:
        suit = "diamonds";
        break;
      case 4:
        suit = "clovers";
        break;
        
    default:
      
    }
    
    randomNumber = (int) ((Math.random() * 13) + 1);
    
    switch (randomNumber) {
      case 11:
        card = "J";
        break;
      case 12:
        card = "Q";
        break;
      case 13:
        card = "K";
        break;
      case 1:
        card = "Ace";
        break;
    default:
      card = String.valueOf(randomNumber);
      
      
    }
    
    
    System.out.println(card + " of " + suit);
    
  }
}
