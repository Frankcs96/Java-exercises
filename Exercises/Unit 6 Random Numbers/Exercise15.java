
public class Exercise15 {
  public static void main(String[] args) {
    
    int numberOfNotes;
    int randomNote;
    String firstNote = "";
    String note = "";
    
    do {     
      numberOfNotes = (int)(Math.random() * ((28 - 4) + 1)) + 4;   
      
    } while (numberOfNotes % 4 != 0);
      
    
    for (int i = 1; i <= numberOfNotes; i++) {
      randomNote = (int)(Math.random() * ((7 - 1) + 1)) + 1; 
      
      switch (randomNote) {
        case 1:
          note = "Do";
          break;
        case 2:
          note = "Re";
          break;
        case 3:
          note = "Mi";
          break;
        case 4:
          note = "Fa";
          break;
        case 5:
          note = "Sol";
          break;
        case 6:
          note = "La";
          break;
        case 7:
          note = "Si";
          break;
        default:
        
      }
      
      if (i == 1) {
        firstNote = note;
      }
      
      
      
      if (i == numberOfNotes) {
        System.out.print(firstNote + " ||");
        
      } else {
        System.out.print(note + " ");
      }
      
      if (i % 4 == 0 && i < numberOfNotes) {
        System.out.print("| ");
      }
          
      
    }
    
  }
}
