
public class Exercise10 {
  public static void main(String[] args) {
    
    int lenght = 0;
    char symbol = 0;
    int random;
    
    for (int i = 1; i <= 10; i++) {
      random = (int)(Math.random() * ((6 - 1) + 1)) + 1;
      lenght = (int)(Math.random() * ((40 - 1) + 1)) + 1;
      
      switch (random) {
        case 1:
          symbol = '*';
          break;
        case 2:
          symbol = '-';
          break;
        case 3:
          symbol = '=';
          break;
        case 4:
          symbol = '.';
          break;
        case 5:
          symbol = '|';
          break;
        case 6:
          symbol = '@';
          break;

        default:
       
      }
              
      for (int j = 1; j <= lenght; j++) {
        System.out.print(symbol);
        
      }
      
      System.out.println();
    }
  }
}
