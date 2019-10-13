
public class Exercise03 {
  public static void main(String[] args) {
    
    String suit = "";
    String card = "";
    
    int randomNumber = (int) ((Math.random() * 4) + 1);
    
    switch (randomNumber) {
      case 1:
        suit = "espadas";
        break;
      case 2:
        suit = "bastos";
        break;
      case 3:
        suit = "oros";
        break;
      case 4:
        suit = "copas";
        break;
        
    default:
      
    }
    
    randomNumber = (int) ((Math.random() * 10) + 1);
    
    switch (randomNumber) {
      case 8:
        card = "sota";
        break;
      case 9:
        card = "caballo";
        break;
      case 10:
        card = "rey";
        break;
      case 1:
        card = "as";
        break;
    default:
      card = String.valueOf(randomNumber);
      
      
    }
    
    
    System.out.println(card + " de " + suit);
    
  }
}