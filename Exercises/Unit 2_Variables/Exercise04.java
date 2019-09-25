


public class Exercise04 {

  public static void main (String[] args) {
    
    double euros = 35;
    
    double pesetas = euros*166.386;
    
    System.out.println("****Euros to pesetas converter****");
    
    System.out.println(euros + " euros in pesetas are: " + Math.round(pesetas*100)/100D + " pesetas");
  }
}

